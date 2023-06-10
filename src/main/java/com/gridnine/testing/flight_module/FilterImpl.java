package com.gridnine.testing.flight_module;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImpl implements Filter{
    @Override
    public void getAllFlights (List<Flight> flightList) {
        flightList.forEach(System.out::println);
    }

    @Override
    public List<Flight> filterBeforeNow(List<Flight> flightList) {
        System.out.println("Список рейсов до текущего момента времени:");
        List<Flight> list = flightList.stream().filter(flight -> flight.getSegments().stream()
                .anyMatch(segment -> segment.getDepartureDate().isBefore(LocalDateTime.now())))
                .toList();
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Flight> filterArrivalBeforeDeparture(List<Flight> flightList) {
        System.out.println("Список рейсов с датой прилета раньше даты вылета:");
        List<Flight> list =   flightList.stream().filter(flight -> flight.getSegments().stream()
                .anyMatch(segment -> segment.getDepartureDate().isBefore(LocalDateTime.now()))).toList();
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Flight> filterTwoHours(List<Flight> flightList) {
        flightList.stream().
                filter(f -> {
                    long hoursGap = 0;
                    for (int i = 0; i < f.getSegments().size() - 1; i++) {
                        Duration duration = Duration.between(f.getSegments().get(i).getArrivalDate(),
                                f.getSegments().get(i + 1).getDepartureDate());
                        hoursGap += duration.toHours();
                    }
                    return hoursGap < 2;
                }).collect(Collectors.toList());
        return flightList;
    }
}
