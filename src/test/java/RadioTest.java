import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldNumberStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 0;
        rad.getNumberRadioStation();
        int expected = 0;
        int actual = rad.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 6;
        int expected = 6;
        int actual = rad.numberRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 6;
        rad.nextRadiostation();
        int expected = 7;
        int actual = rad.numberRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 9;
        rad.prevRadiostation();
        int expected = 8;
        int actual = rad.numberRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRadioStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 0;
        rad.prevRadiostation();
        rad.setNumberRadiostation();
        int expected = 9;
        int actual = rad.numberRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRadioStation() {
        Radio rad = new Radio();
        rad.numberRadiostation = 9;
        rad.nextRadiostation();
        rad.setNumberRadiostation();
        int expected = 0;
        int actual = rad.numberRadiostation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 99;
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 1;
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 100;
        rad.increaseVolume();
        rad.maxMinVolume();
        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        rad.decreaseVolume();
        rad.maxMinVolume();
        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
