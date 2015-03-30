package Ch01.Section01;

import Shared.Point;
import Shared.PointConnection;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.util.*;
import java.util.List;

/**
 * Created on 05.03.2015.
 */
public class Ex31 {


    public void Generate(int n){
        StdDraw.setPenColor(241, 241, 241);
        StdDraw.filledCircle(0.5, 0.5, 1);

        StdDraw.setXscale(-2.0, +2.0);
        StdDraw.setYscale(-2.0, +2.0);

        StdDraw.setPenColor(189, 212, 222);
        StdDraw.setPenRadius(0.005);
        StdDraw.circle(0, 0, 1);

        Point[] points = GenerateNPointsOnCircle(n);
        PointConnection[] connections = GenerateRandomPointConnections(points);

        DrawConnections(connections);
        DrawPoints(points);
    }
    private void DrawConnections(PointConnection[] connections){
        StdDraw.setPenColor(63, 87, 101);
        for(int i = 0; i < connections.length; i++) {
            PointConnection connection = connections[i];
            StdDraw.line(connection.getFirstPoint().GetX(), connection.getFirstPoint().GetY(), connection.getSecondPoint().GetX(), connection.getSecondPoint().GetY());
        }
    }
    private void DrawPoints(Point[] points){
        StdDraw.setPenColor(255, 83, 13);
        for(int i = 0; i < points.length; i++) {
            StdDraw.filledCircle(points[i].GetX(), points[i].GetY(), 0.05);
        }
    }
    private Point[] GenerateNPointsOnCircle(int n){
        Point[] points = new Point[n];

        for(int i=0; i < n; i++){
            points[i] = new Point(Math.cos(2*Math.PI/n * i), Math.sin(2*Math.PI/n * i));
        }

        return points;
    }
    private PointConnection[] GenerateRandomPointConnections(Point[] points){
        List<PointConnection> connections = new ArrayList<PointConnection>();
        for(int i = 0; i < points.length; i++){
            for(int j = i+1; j < points.length; j++){
                if(StdRandom.bernoulli(0.5)){
                    connections.add(new PointConnection(points[i], points[j]));
                }
            }
        }
        return connections.toArray(new PointConnection[0]);
    }
}