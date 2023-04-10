package ru.netology.oopclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setVolume.csv")
    public void VolumeSetter(int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void decreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStation.csv")
    public void stationSetter(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void setNextStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.setNextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    public void setPrevStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityOfStationsIsDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getQuantityOfStations());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/chooseValidQuantityOfStation.csv")
    public void shouldChooseValidQuantityOfStations(int aQuantityOfStations, int expected) {
        Radio radio = new Radio(aQuantityOfStations);

        Assertions.assertEquals(expected, radio.getQuantityOfStations());

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setNextStationIfQuantityOfStationsIsNotDefault.csv")
    public void shouldSetNextStationIfQuantityOfStationsIsNotDefault(int aQuantityOfStations, int currentStation, int expected) {
        Radio radio = new Radio(aQuantityOfStations);

        radio.setCurrentStation(currentStation);
        radio.setNextStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setPrevStationIfQuantityOfStationsIsNotDefault.csv")
    public void shouldSetPrevStationIfQuantityOfStationsIsNotDefault(int aQuantityOfStations, int currentStation, int expected) {
        Radio radio = new Radio(aQuantityOfStations);

        radio.setCurrentStation(currentStation);
        radio.setPrevStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/firstAndLastStations.csv")
    public void firstAndLastStations(int aQuantityOfStations, int expectedTheFirst, int expectedTheLast) {
        Radio radio = new Radio(aQuantityOfStations);

        Assertions.assertEquals(expectedTheFirst, radio.getTheFirstStation());
        Assertions.assertEquals(expectedTheLast, radio.getTheLastStation());
    }
}
