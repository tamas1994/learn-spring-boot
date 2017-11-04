package com.folkcat.learnspringboot.oracl;

/**
 * Created by Tamas on 2017/10/16.
 */
public class Allocation {

    private String id;
    private String ckCounterTimeId;
    private String flight;
    private String carrier;
    private String flightTask;
    private String flightId;
    private String airportCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCkCounterTimeId() {
        return ckCounterTimeId;
    }

    public void setCkCounterTimeId(String ckCounterTimeId) {
        this.ckCounterTimeId = ckCounterTimeId;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightTask() {
        return flightTask;
    }

    public void setFlightTask(String flightTask) {
        this.flightTask = flightTask;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }
}
