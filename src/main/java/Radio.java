public class Radio {
    int stationQuantity = 10;
    int currentStation;
    int volume;
    int maxStation;

    public Radio() {
        maxStation = stationQuantity - 1;
    }

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
        maxStation = stationQuantity - 1;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            setCurrentStation(getCurrentStation() + 1);
        }
        if (currentStation == maxStation) {
            setCurrentStation(0);
        }
    }

    public void prevStation() {
        if (currentStation <= maxStation && currentStation >= 0) {
            if (currentStation == 0) {
                setCurrentStation(maxStation);
            } else {
                setCurrentStation(getCurrentStation() - 1);
            }
        }
    }

    /////////////////getter / setter////////////
    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationQuantity() {
        return stationQuantity;
    }

    public void setCurrentStation(int newStation) {
        this.currentStation = (newStation >= 0) && (newStation <= maxStation) ? newStation : getCurrentStation();
    }
/////////////////////////////////////////////////////
    public void decreaseVolume() {
        if (volume <= 100 && volume > 0) {
            volume -= 1;
    }
}
    public void increaseVolume() {
        if (volume < 100 && volume >= 0) {
            volume += 1;
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
