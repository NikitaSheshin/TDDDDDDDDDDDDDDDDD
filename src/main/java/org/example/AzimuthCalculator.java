package org.example;

public class AzimuthCalculator {
    public double calculateAzimuth(Point firstPoint, Point secondPoint) {
        if(firstPoint.getLatitude() == -secondPoint.getLatitude() &&
        firstPoint.getLongitude() == -secondPoint.getLongitude()) {
            return AzimuthAnswer.ANY.getAnswerCode();
        }

        if(firstPoint.equals(secondPoint)) {
            return AzimuthAnswer.NONE.getAnswerCode();
        }

        if(Math.abs(firstPoint.getLatitude()) == 90 ||
        Math.abs(secondPoint.getLatitude()) == 90) {
            return 180;
        }

        return firstPoint.getLatitude() * firstPoint.getLongitude() +
                secondPoint.getLatitude() * secondPoint.getLongitude();
    }
}
