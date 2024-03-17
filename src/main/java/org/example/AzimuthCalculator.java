package org.example;

public class AzimuthCalculator {
    public double calculateAzimuth(Point firstPoint, Point secondPoint) {
        if(firstPoint.getLatitude() == -secondPoint.getLatitude() &&
        firstPoint.getLongitude() == -secondPoint.getLongitude()) {
            return AzimuthAnswer.ANY.getAnswerCode();
        }

        return 0;
    }
}
