package com.kodilla.exception.test;

public class FlightRouteRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Birmingham", "London");

        try {
            flight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
