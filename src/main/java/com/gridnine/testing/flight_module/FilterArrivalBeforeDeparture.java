package com.gridnine.testing.flight_module;

import com.gridnine.testing.flight_module.Flight;
import com.gridnine.testing.flight_module.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterArrivalBeforeDeparture implements Filter {
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        System.out.println("Список рейсов с датой прилета раньше даты вылета:");
        List<Flight> flights = new ArrayList<>();
        flightList.forEach(flight -> flight.getSegments()
                .stream()
                .filter(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate()))
                .forEach(segment -> flights.add(flight)));
        return flights;
    }
}
