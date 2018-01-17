package com.folkcat.learnspringboot;

import com.folkcat.learnspringboot.statemachine.Event;
import com.folkcat.learnspringboot.statemachine.State;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

/**
 * Created by Tamas on 2018/1/17.
 */
public class StateMachineTest extends BaseTest {

    @Autowired
    StateMachine<Event,State> stateMachine;

    @Test
    public void start(){
        stateMachine.start();
        stateMachine.sendEvent(State.DONE);
    }

}
