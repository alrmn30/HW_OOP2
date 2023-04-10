package ru.netology.oopclasses;
public class Radio {
    private int currentVolume;
    private int quantityOfStations = 10;
    private int theFirstStation;
    private int theLastStation = quantityOfStations - 1; // ???
    private int currentStation = theFirstStation;

    public Radio() {
    }

    public Radio (int aQuantityOfStations) {

//        if (aQuantityOfStations == 1) {
//            theFirstStation = 1;
//            theLastStation = 1;
//        }
//        if (aQuantityOfStations <= 0) {
//        ???
//        }
        quantityOfStations = aQuantityOfStations;
        theLastStation = quantityOfStations -1;
    }

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


    public void setCurrentStation(int newStation) {
        if (newStation < theFirstStation) {
            currentStation = theFirstStation;
            return;
        }
        if (newStation > theLastStation) {
            currentStation = theLastStation;
            return;
        }
        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        if (currentStation == theLastStation) {
            currentStation = theFirstStation;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation == theFirstStation) {
            currentStation = theLastStation;
        } else {
            currentStation -= 1;
        }
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public int getTheFirstStation() {
        return theFirstStation;
    }
    public int getTheLastStation() {
        return theLastStation;
    }

}



