public class Radio {

    int currentStation;
    int volume;


    public void nextStation() {
        if (currentStation < 9) {
            setCurrentStation(getCurrentStation() + 1);
        }
        if (currentStation == 9) {
            setCurrentStation(0);
        }
    }

    public void prevStation() {
        if (currentStation <= 9 && currentStation >= 0) {
            if (currentStation == 0) {
                setCurrentStation(9);
            } else {
                setCurrentStation(getCurrentStation() - 1);
            }
        }
    }

    /////////////////getter / setter////////////
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        this.currentStation = (newStation >= 0) && (newStation <= 9) ? newStation : getCurrentStation();
    }
/////////////////////////////////////////////////////

    public void increaseVolume() {
        if (volume < 100 && volume >= 0) {
            volume += 1;
        }
    }

    public void decreaseVolume() {
        if (volume <= 100 && volume > 0) {
            volume -= 1;
        }
    }

    ///////////////////////////////////////////////////////
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

    public int getVolume() {
        return this.volume;
    }
//////////////////////////////////////////////////////////
}
