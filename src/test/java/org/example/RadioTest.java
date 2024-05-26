package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldNextNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(0);
        number.setNextNumber();

        int expected = 1;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(1);

        number.setPrevNumber();

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAboveMax() {
        Radio number = new Radio();
        number.setCurrentNumber(9);
        number.setNextNumber();

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevNumberBelowMin() {
        Radio number = new Radio();
        number.setCurrentNumber(0);

        number.setPrevNumber();

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(7);

        int expected = 7;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberAboveMax() {
        Radio number = new Radio();
        number.setCurrentNumber(10);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberBelowMin() {
        Radio number = new Radio();
        number.setCurrentNumber(-2);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(25);

        int expected = 25;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.setNextVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.setPrevVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setNextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setPrevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


























