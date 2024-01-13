package com.java8features.datatime;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.*;
import java.util.Date;

public class DateAndTime {
    //17-Java-8-Features-19-Oct
    public  void DateAndTime(){

    }
    public static <newDate> void main(String[] args) {
        System.out.println("This is Example for date and time in java 8");

        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate customelocalDate = LocalDate.of(2023,03,5);
        System.out.println(customelocalDate);

        Boolean isBefore = LocalDate.parse("2015-02-26").isBefore(LocalDate.parse("2014-09-26"));
        System.out.println(isBefore);


        Boolean isAfter = LocalDate.parse("2015-02-26").isAfter(LocalDate.parse("2016-09-26"));
        System.out.println(isAfter);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.getYear());
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.getDayOfMonth());
        System.out.println(zonedDateTime.getMonthValue());

        Period period = Period.ofDays(5);
        System.out.println(period.getDays());

        Period period1 = Period.between(LocalDate.parse("1994-05-25"), LocalDate.now());
        System.out.println(period1.plusMonths(6));
        System.out.println(period1.getYears());
        System.out.println(period1.getMonths());
        System.out.println("Total Year  -> " + period1.getYears() + "Year / "+ period1.getMonths() + "Months");

        Duration duration = Duration.between(LocalTime.parse("02:23"), LocalTime.parse("03:00"));
        System.out.println(duration.getSeconds());

    }
}
