package ru.netology.radio;

public class Radio {
    public int numberRadiostation;

    public int getNumberRadioStation() {
        return numberRadiostation;
    }

    public void nextRadiostation() {
        if (numberRadiostation <= 9) {
            numberRadiostation = numberRadiostation + 1;
        }
    }

        public void prevRadiostation() {
            if (numberRadiostation >= 0) {
                numberRadiostation = numberRadiostation - 1;
            }
        }

        public void setNumberRadiostation() {
            if (numberRadiostation < 0) {
                numberRadiostation = 9;
            }

            if (numberRadiostation > 9) {
                numberRadiostation = 0;
            }
        }

        public int currentVolume;

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

        public void maxMinVolume() {
            if (currentVolume < 0) {
                return;

            }
            if (currentVolume > 100) {
                return;
            }
        }
    }
