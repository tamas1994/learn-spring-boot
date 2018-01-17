package com.folkcat.learnspringboot.statemachine;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.transition.Transition;

import java.util.EnumSet;

/**
 * Created by Tamas on 2018/1/17.
 */
@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<State, Event> {

    private Logger logger = Logger.getLogger(getClass());

    @Override
    public void configure(StateMachineStateConfigurer<State, Event> states)
            throws Exception {
        states
                .withStates()
                .initial(State.UNPAID)
                .states(EnumSet.allOf(State.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<State, Event> transitions)
            throws Exception {
        transitions
                .withExternal()
                .source(State.UNPAID).target(State.WAITING_FOR_RECEIVE)
                .event(Event.PAY)
                .and()
                .withExternal()
                .source(State.WAITING_FOR_RECEIVE).target(State.DONE)
                .event(Event.RECEIVE);
    }

    @Override
    public void configure(StateMachineConfigurationConfigurer<State, Event> config)
            throws Exception {
        config
                .withConfiguration()
                .listener(listener());
    }

    @Bean
    public StateMachineListener<State, Event> listener() {
        return new StateMachineListenerAdapter<State, Event>() {

            @Override
            public void transition(Transition<State, Event> transition) {
                if (transition.getTarget().getId() == State.UNPAID) {
                    logger.info("订单创建，待支付");
                    return;
                }

                if (transition.getSource().getId() == State.UNPAID
                        && transition.getTarget().getId() == State.WAITING_FOR_RECEIVE) {
                    logger.info("用户完成支付，待收货");
                    return;
                }

                if (transition.getSource().getId() == State.WAITING_FOR_RECEIVE
                        && transition.getTarget().getId() == State.DONE) {
                    logger.info("用户已收货，订单完成");
                    return;
                }
            }

        };
    }

}