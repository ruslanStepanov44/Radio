package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    public int stationAmount = 10;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {

    }



    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > stationAmount -1) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == stationAmount -1) {
            currentRadioStation = 0;

        } else {
            currentRadioStation ++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = stationAmount - 1;
        } else {
            currentRadioStation --;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}