package SomeClasses;

import TheOnlyClass.Point;

public class Line {

    Point start;

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    Point end;

    public Line(Point n1, Point n2){
        this.start = n1;
        this.end = n2;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }


    public String toString()
    {
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
