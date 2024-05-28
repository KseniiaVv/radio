package org.example;

public class Radio {

    private int maxNumber = 9;
    private int minNumber = 0;
    private int currentNumber = minNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio( int maxVolume,  int minVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }



    public Radio(int size) {
        maxNumber = minNumber + size - 1;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }



    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber > maxNumber) {
            return;
        }
        if (newCurrentNumber < minNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setNextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
    }

    public void setPrevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setPrevVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}


