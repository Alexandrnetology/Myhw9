package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextStation() {
        if (currentStation != 9) {
            currentStation = currentStation + 1;
        }
        else {currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        else {currentVolume = 100;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {currentVolume = 0;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

