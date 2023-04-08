package ru.netology.oopclasses;

import org.junit.jupiter.api.Assertions;
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
}
