package ru.netology.oopclasses;
public class Radio {

    private int currentVolume;

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
            return;
        } else {
            return;
        }
//        if (currentVolume == 100) {
//            return;     // currentVolume = 100;
//        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        } else {
            return;
        }
//        if (currentVolume == 0) {
//            return;
//        }
    }


    private int currentStation;

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            currentStation = 0;
            return;
        }
        if (newStation > 9) {
            currentStation = 9;
            return;
        }
        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }


}



