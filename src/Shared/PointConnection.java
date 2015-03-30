package Shared;

/**
 * Created on 06.03.2015.
 */

public class PointConnection{
    public PointConnection(Point firstPoint, Point secondPoint) {
        assert firstPoint != null;
        assert secondPoint != null;

        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() { return firstPoint; }
    private final Point firstPoint;

    public Point getSecondPoint() { return secondPoint; }
    private final Point secondPoint;

    public static double distance(Point firstPoint, Point secondPoint){
        return Math.sqrt(Math.pow((firstPoint.GetX() - secondPoint.GetX()), 2) + Math.pow(firstPoint.GetY() - secondPoint.GetY(), 2));
    }
}
