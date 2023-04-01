//Creating a public class with Latitude, Longitude, and UID
public class Coordinates {
    private Double Latitude;
    private Double Longitude;
    private Long UID;

    public Coordinates() {
        Latitude = 0.0;
        Longitude = 0.0;
        UID = 0L;
    }

    public Coordinates(double La, double Lo, long ID) {
        Latitude = La;
        Longitude = Lo;
        UID = ID;
    }

    public void setLatitude(double l) {
        Latitude = l;
    }
    
    public double getLatitude() {
        return Latitude;
    }

    public void setLongitude(double l) {
        Longitude = l;
    }
    
    public double getLongitude() {
        return Longitude;
    }

    public long getUID() {
        return UID;
    }
    public String toString(){return UID.toString()+","+Latitude.toString()+","+Longitude.toString();}

    
}
