package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(20);


    @Test
    public void shouldUseRadio() {
        radio.setCurrentChanel(4);
        assertEquals(4, radio.getNumberOfChanel());
    }

    @Test
    public void shouldUseRadio2() {
        radio.setCurrentChanel(20);
        assertEquals(0, radio.getNumberOfChanel());
    }

    @Test
    public void testVolume() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(35);
        radio.increaseVolume();
        int expected = 36;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        radio.setCurrentVolume(2);
        radio.lowerVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2() {
        radio.setCurrentVolume(0);
        radio.lowerVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel() {
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel2() {
        radio.setCurrentChanel(20);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel3() {
        radio.setCurrentChanel(8);
        int expected = 8;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel4() {
        radio.setCurrentChanel(-1);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentMaxChanel() {
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }



    @Test
    public void setCurrentMinChanel() {
        radio.setCurrentChanel(0);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextChanel() {
        radio.setCurrentChanel(6);
        radio.nextChanel();
        assertEquals(7, radio.getCurrentChanel());
    }

    @Test
    void shouldPrevChanel() {
        radio.setCurrentChanel(6);
        radio.prevChanel();
        assertEquals(5, radio.getCurrentChanel());
    }

    @Test
    void shouldSetChanelOverMaxChanel() {
        radio.setCurrentChanel(22);
        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    void shouldSetCurrentChanelUnderMinChanel() {
        radio.setCurrentChanel(-1);
        assertEquals(0, radio.getCurrentChanel());
    }
    @Test
    void shouldOverMaxStation1() {
        radio.setCurrentChanel(19);
        radio.nextChanel();
        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    void shouldOverMaxStation2() {
        radio.setCurrentChanel(20);
        radio.nextChanel();
        assertEquals(1, radio.getCurrentChanel());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentChanel(4);
        radio.prevChanel();
        assertEquals(3, radio.getCurrentChanel());
    }

    @Test
    void shouldBelowMinStation1() {
        radio.setCurrentChanel(0);
        radio.prevChanel();
        assertEquals(19, radio.getCurrentChanel());
    }

    @Test
    void shouldBelowMinStation2() {
        radio.setCurrentChanel(-1);
        radio.prevChanel();
        assertEquals(19, radio.getCurrentChanel());
    }
    @Test
    public void fifteenStation() {
        radio.setCurrentChanel(15);
        assertEquals(15, radio.getNumberOfChanel());
    }

}

