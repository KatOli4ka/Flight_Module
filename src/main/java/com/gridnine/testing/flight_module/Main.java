package com.gridnine.testing.flight_module;

public class Main {
    public static void main(String[] args) {
        Filter beforeNow = new FilterBeforeNow();
        beforeNow.filter(FlightBuilder.createFlights()).forEach(System.out::println);

        Filter arrivalBeforeDeparture = new FilterArrivalBeforeDeparture();
        arrivalBeforeDeparture.filter(FlightBuilder.createFlights()).forEach(System.out::println);

        Filter twoHours = new FilterTwoHours();
        twoHours.filter(FlightBuilder.createFlights()).forEach(System.out::println);
    }
}
