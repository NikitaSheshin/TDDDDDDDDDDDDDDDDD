package org.example;

public class Point {
    private double latitude;
    private double longitude;

    public Point(double latitude, double longitude)
    {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        if(!(latitude >= -90 && latitude <= 90)) {
            throw new IllegalArgumentException("Некорректная широта");
        }

        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        if(!(longitude >= -180 && longitude <= 180)) {
            throw new IllegalArgumentException("Некорректная долгота");
        }

        this.longitude = longitude;
    }
}
