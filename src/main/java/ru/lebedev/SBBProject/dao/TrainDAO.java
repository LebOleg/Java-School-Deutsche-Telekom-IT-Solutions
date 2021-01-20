package ru.lebedev.SBBProject.dao;

import ru.lebedev.SBBProject.model.Train;

import java.util.List;
import java.util.Optional;

public interface TrainDAO {
    Integer getCurrentAvailableSeats(Integer trainNumber);

    Train getTrainById(Integer id);

    void updateAvailableSeats(Train train);

    void saveTrain(Train train);

    List<Train> getAvailableTrains();
}
