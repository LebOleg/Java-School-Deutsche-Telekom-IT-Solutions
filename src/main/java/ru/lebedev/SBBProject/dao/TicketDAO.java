package ru.lebedev.SBBProject.dao;

import ru.lebedev.SBBProject.model.Timetable;

import java.time.LocalDate;
import java.time.LocalTime;

public interface TicketDAO {
    Timetable getSuitableTrainInTimetable(String fromStation, String toStation, LocalTime fromTime, LocalTime toTime, LocalDate date);
}