package org.example;

public class Point {
    double latitude;
    double longitude;

    public Point(double latitude, double longitude)
    {
        if(!(latitude >= -90 && latitude <= 90) ||
                !(longitude >= -180 && longitude <= 180)) {
            throw new IllegalArgumentException();
        }

        this.longitude = longitude;
        this.latitude = latitude;
    }
}
