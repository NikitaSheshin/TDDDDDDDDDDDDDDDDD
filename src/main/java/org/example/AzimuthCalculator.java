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

        return 0;
    }
}
