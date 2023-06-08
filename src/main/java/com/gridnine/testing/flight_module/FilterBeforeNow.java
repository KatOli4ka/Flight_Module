package com.gridnine.testing.flight_module;

import com.gridnine.testing.flight_module.Flight;
import com.gridnine.testing.flight_module.Segment;
import com.gridnine.testing.flight_module.Filter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FilterBeforeNow implements Filter {
    private final LocalDateTime now = LocalDateTime.now();
    @Override
    public List<Flight> filter(List<Flight> flights) {
        System.out.println("Список рейсов до текущего момента времени:");
        List<Flight> list = new ArrayList<>();
        for (Flight flight : flights) {
            for (Segment segment : flight.getSegments()) {
                if (now.isBefore(segment.getDepartureDate())) {
                    list.add(flight);
                    break;
                }
            }
        }
        return list;
    }
}
