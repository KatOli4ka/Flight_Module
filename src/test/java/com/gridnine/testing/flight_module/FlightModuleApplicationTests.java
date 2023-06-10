package com.gridnine.testing.flight_module;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static com.gridnine.testing.flight_module.InputForTesting.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class FlightModuleApplicationTests {
   Filter filterSegment = new FilterImpl();
    @Test
    void contextLoads() {
    }

    @Test
    void hasFlightsBeforeCurrentTime() {
        List<Flight> expected = filterSegment.filterBeforeNow(allFlights);
        assertEquals(expected, actualListDepartureBeforeNow);
    }
    @Test
    void hasArrivalDateBeforeDepartureDate() {
        List<Flight> expected = filterSegment.filterArrivalBeforeDeparture(allFlights);
        assertEquals(expected, actualListArrivalBeforeDeparture);
    }

    @Test
    void hasFlightMoreThanTwoHours() {
        List<Flight> expected = filterSegment.filterTwoHours(allFlights);
        assertEquals(expected, actualListMoreTwoHours);
    }


}
