package ru.lebedev.SBBProject.utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomConverter {

    public static LocalDateTime convertStringToTimeAndDate(String time, String date) {

        if (time.equals("") || date.equals("")) {
            return null;
        }

        String fullDate = date + "T" + time;
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        return LocalDateTime.parse(fullDate, formatter);
    }

    public static LocalDate convertStringToDate(String date) {
        return LocalDate.parse(date);
    }

    public static LocalTime convertStringToTime(String time) {

        return LocalTime.parse(time);
    }

}
