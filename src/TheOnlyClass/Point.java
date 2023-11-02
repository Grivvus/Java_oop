package TheOnlyClass;

public class Point {

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "{" + this.x + ";" + this.y + "}";
    }
}
