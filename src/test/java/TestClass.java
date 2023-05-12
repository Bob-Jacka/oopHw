import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {


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
        radio.setCurrentStation(20);
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

    @Test
    public void getStationQuantityTest() {
        Radio radio = new Radio(50);
        int act = radio.getStationQuantity();
        int exp = 50;

        Assertions.assertEquals(exp, act);
    }

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
    public void nextStationTestAfterMaximumQuantity() {
        Radio radio = new Radio(50);
        radio.currentStation = 49;
        radio.nextStation();
        int exp = 0;
        int act = radio.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio(10);
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
    public void shouldNotEqualsWithStationQuantity() {
        Radio radio1 = new Radio();
        Main radio2 = new Main();
        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotEqualsBecauseDifStation() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(5);
        Radio radio2 = new Radio(10);
        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotEqualsBecauseDifStationQuantity() {
        Radio radio1 = new Radio(50);
        Radio radio2 = new Radio(10);
        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotEqualsBecauseDifVolume() {
        Radio radio1 = new Radio(10);
        radio1.setVolume(15);
        Radio radio2 = new Radio(10);
        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldEquals1() {
        Radio radio1 = new Radio();
        boolean act = radio1.equals(radio1);
        boolean exp = true;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotEquals() {
        Radio radio1 = new Radio();
        boolean act1 = radio1.equals(null);
        boolean exp = false;
        Assertions.assertEquals(exp, act1);

    }

    @Test
    public void shouldEqualsAcceptable() {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();
        Radio radio3 = new Radio();
        if (radio1.equals(radio2) && radio2.equals(radio3)) {
            boolean act1 = radio3.equals(radio1);
            boolean exp = true;

            Assertions.assertEquals(exp, act1);
        }
    }

    @Test
    public void shouldEqualsBecauseIwant() {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();
        if (radio1.equals(radio2)) {
            assert radio1.equals(radio2) == true;
        }
    }

    @Test
    public void shouldEqualsBecauseMaxStation() {
        Radio radio1 = new Radio();
        radio1.setMaxStation(15);
        Radio radio2 = new Radio();
        radio2.setMaxStation(14);
        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }

    //    @Test
//    public void shouldEqualsBecauseSame() {
//        Radio radio1 = new Radio();
//        Radio radio2 = new Radio(15);
//        radio2.setVolume(15);
//        boolean exp = true;
//        boolean act = radio1.canEqual(radio2);
//        Assertions.assertEquals(exp, act);
//
//    }
    @Test
    public void shouldNotEqualsBecauseCanEqual() {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        boolean act = radio1.equals(radio2);
        boolean exp = false;
        Assertions.assertEquals(exp, act);
    }
}



