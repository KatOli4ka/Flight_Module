package com.gridnine.testing.flight_module;


import java.util.List;

public interface Filter {
    void getAllFlights(List<Flight> flightList);
    List<Flight> filterBeforeNow(List<Flight> flightList);
    List<Flight> filterArrivalBeforeDeparture(List<Flight> flightList);
    List<Flight> filterTwoHours(List<Flight> flightList);

}
