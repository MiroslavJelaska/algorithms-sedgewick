package Shared;

/**
 * Created on 06.03.2015.
 */

public class Point{
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double GetX(){ return x; }
    private final double x;

    public double GetY(){ return y; }
    private final double y;
}