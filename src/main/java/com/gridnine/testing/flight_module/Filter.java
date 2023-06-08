package com.gridnine.testing.flight_module;
import com.gridnine.testing.flight_module.Flight;

import java.util.List;

public interface Filter {
    List<Flight> filter(List<Flight> flightList);
}
