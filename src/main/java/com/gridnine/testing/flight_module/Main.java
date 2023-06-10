package com.gridnine.testing.flight_module;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = FlightBuilder.createFlights();
        Filter module = new FilterImpl();

        System.out.println("Все рейсы: ");
        module.getAllFlights(flightList);
        System.out.println();

        System.out.println("Вылет до текущего момента времени: ");
        module.filterBeforeNow(flightList);
        System.out.println();

        System.out.println("Cегменты с датой прилёта раньше даты вылета: ");
        module.filterArrivalBeforeDeparture(flightList);
        System.out.println();

        System.out.println("Общее время, проведённое на земле превышает два часа: ");
        module.filterTwoHours(flightList);
        System.out.println();
    }
}
