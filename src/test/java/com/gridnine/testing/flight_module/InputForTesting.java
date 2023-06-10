package com.gridnine.testing.flight_module;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class InputForTesting {
    private static final LocalDateTime CURRENT_DATE = LocalDateTime.now().plusDays(3);

    /**
     * Стандартный 4-х часовой перелет
     */
    public static Flight standartFlight = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(4))
    ));
    /**
     * Перелет, состоящий из 2-х сегментов
     */
    public static Flight flightTwoSegments = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(3), CURRENT_DATE.plusHours(7))
    ));
    /**
     * Перелет, в котором дата вылета раньше текущей даты на несколько дней
     */
    public static Flight departureThePastDays = new Flight(List.of(
            new Segment(CURRENT_DATE.minusDays(4), CURRENT_DATE)
    ));
    /**
     * Перелет, в котором дата вылета раньше текущей даты на несколько недель
     */
    public static Flight departureThePastWeeks = new Flight(List.of(
            new Segment(CURRENT_DATE.minusWeeks(1), CURRENT_DATE)
    ));
    /**
     * Перелет, в котором время прилета раньше времени вылета
     */
    public static  Flight arrivalBeforeDepartureNoSegment = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.minusHours(8))
    ));
    /**
     * Перелет, в котором у одного сегмента время прилета раньше времени вылета
     */
    public static Flight arrivalBeforeDepartureSegments = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(3)),
            new Segment(CURRENT_DATE.plusHours(5), CURRENT_DATE.plusHours(4)),
            new Segment(CURRENT_DATE.plusHours(6), CURRENT_DATE.plusHours(8))
    ));
    /**
     * Перелет с временем между пересадками более 2-х часов - 2 сегмента
     */
    public static  Flight moreTwoHours2Segments = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(5), CURRENT_DATE.plusHours(6))
    ));
    /**
     * Перелет с временем между пересадками более 2-х часов - 3 сегмента
     */
    public static  Flight moreTwoHours3Segments = new Flight(List.of(
            new Segment(CURRENT_DATE, CURRENT_DATE.plusHours(2)),
            new Segment(CURRENT_DATE.plusHours(3), CURRENT_DATE.plusHours(5)),
            new Segment(CURRENT_DATE.plusHours(8), CURRENT_DATE.plusHours(9))
    ));
    /**
     * Данные для сравнения - актуальные списки
     */
    public static  List<Flight> allFlights = Arrays.asList(standartFlight, flightTwoSegments,
            departureThePastDays, departureThePastWeeks, arrivalBeforeDepartureNoSegment,
            arrivalBeforeDepartureSegments, moreTwoHours2Segments, moreTwoHours3Segments);
    public static  List<Flight> actualListDepartureBeforeNow = Arrays.asList(departureThePastDays, departureThePastWeeks);
    public static  List<Flight> actualListArrivalBeforeDeparture = Arrays.asList(arrivalBeforeDepartureNoSegment, arrivalBeforeDepartureSegments);
    public static  List<Flight> actualListMoreTwoHours = Arrays.asList(moreTwoHours2Segments,moreTwoHours3Segments);
}
