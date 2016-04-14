package volcano.map;

public class Airport {

    private final int latitude;

    private final int longitude;

    public Airport(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

}
