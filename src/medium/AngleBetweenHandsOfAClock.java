package medium;

public class AngleBetweenHandsOfAClock {

    public double angleClock(int hour, int minutes) {
        double minutesAngle = (minutes * 6) % 360;
        double hoursAngle = ((30 * hour) % 360) + 30 * (minutes / 60.0);
        double angel = Math.abs(minutesAngle - hoursAngle);
        return Math.min(angel, 360 - angel);
    }


}
