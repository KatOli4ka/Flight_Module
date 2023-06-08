package com.gridnine.testing.flight_module;

import java.time.Duration;

import java.util.List;
import java.util.stream.Collectors;

public class FilterTwoHours implements Filter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream().
                filter(f -> {
                    long hoursGap = 0;
                    for (int i = 0; i < f.getSegments().size() - 1; i++) {
                        Duration duration = Duration.between(f.getSegments().get(i).getArrivalDate(), f.getSegments().get(i + 1).getDepartureDate());
                        hoursGap += duration.toHours();
                    }
                    return hoursGap < 2;
                }).collect(Collectors.toList());
    }
}
