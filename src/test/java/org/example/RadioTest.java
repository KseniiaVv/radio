package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldGetNumber() {
        Radio number = new Radio(10);

        Assertions.assertEquals(0, number.getMinNumber());
        Assertions.assertEquals(9, number.getMaxNumber());
        Assertions.assertEquals(0, number.getCurrentNumber());

    }

    @Test
    public void shouldGetVolume() {
        Radio volume = new Radio(10);

        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextNumber() {
        Radio number = new Radio(10);
        number.setCurrentNumber(0);

        number.setNextNumber();

        int expected = 1;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        Radio number = new Radio(10);
        number.setCurrentNumber(9);

        number.setPrevNumber();

        int expected = 8;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentNumber(9);
        number.setNextNumber();

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevNumberBelowMin() {
        Radio number = new Radio(10);
        number.setCurrentNumber(0);

        number.setPrevNumber();

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumber() {
        Radio number = new Radio(10);
        number.setCurrentNumber(7);

        int expected = 7;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentNumber(10);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberBelowMin() {
        Radio number = new Radio(10);
        number.setCurrentNumber(-2);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(25);

        int expected = 25;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeBelowMin() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(50);
        volume.setNextVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(50);
        volume.setPrevVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(100);

        volume.setNextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio(100, 0);
        volume.setCurrentVolume(0);

        volume.setPrevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


























