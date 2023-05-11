import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {


    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.nextStation();
        int exp = 1;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void nextStationTestAfterNine() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.nextStation();
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prevStation();
        int exp = 9;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void prevStationTestWithFive() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.prevStation();
        int exp = 4;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void prevStationTestWithOne() {
        Radio radio = new Radio();
        radio.currentStation = 1;
        radio.prevStation();
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void prevStationTestWithNine() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.prevStation();
        int exp = 8;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void negativePrevStationTestWithFifteen() {
        Radio radio = new Radio();
        radio.currentStation = 15;
        radio.prevStation();
        int exp = 15;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void negativePrevStationTestWithMSeven() {
        Radio radio = new Radio();
        radio.currentStation = -7;
        radio.prevStation();
        int exp = -7;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }


    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int exp = 1;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void negativeIncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.volume = -100;
        radio.increaseVolume();
        int exp = -100;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void increaseVolumeTestWithHundred() {
        Radio radio = new Radio();
        radio.volume = 100;
        radio.increaseVolume();
        int exp = 100;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void decreaseVolumeTestWithOne() {
        Radio radio = new Radio();
        radio.volume = 1;
        radio.decreaseVolume();
        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.decreaseVolume();
        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void negativeDecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.volume = 101;
        radio.decreaseVolume();
        int exp = 101;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }


    @Test
    public void radioSetterTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int exp = 4;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void radioSetterTestWithNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int exp = 9;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test()
    public void negativeRadioSetterTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test()
    public void negativeRadioSetterTestWithMSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void radioGetterTest() {
        Radio radio = new Radio();
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    /////////////////////////////////////////////
    @Test
    public void volumeGetterTest() {
        Radio radio = new Radio();
        int exp = 0;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void volumeSetterTest() {
        Radio radio = new Radio();
        radio.setVolume(20);
        int exp = 20;
        int act = radio.getVolume();

        Assertions.assertEquals(exp, act);
    }
}
