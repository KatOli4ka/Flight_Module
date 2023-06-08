package com.gridnine.testing.flight_module;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class FlightModuleApplicationTests {

    List<Flight> flights = FlightBuilder.createFlights();
    LocalDateTime time = LocalDateTime.now();
    @Test
    void contextLoads() {
    }

    @Test
    void hasFlightsBeforeCurrentTime() {
        F
    }


}
