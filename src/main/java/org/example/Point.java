package org.example;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(latitude, point.latitude) == 0 && Double.compare(longitude, point.longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}
