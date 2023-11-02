package Arrs;

import TheOnlyClass.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine {
    private List<Point> points;

    public BrokenLine(){
        this.points = new ArrayList<>();
    }

    public BrokenLine(List<Point> p){
        this.points = p;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void addPoint(Point p){
        this.points.add(p);
    }



    public String toString(){
        return "SomeClasses.Line " + this.points.toString();
    }
}
