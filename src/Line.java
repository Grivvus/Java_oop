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

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
