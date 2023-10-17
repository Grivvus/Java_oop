import Chapter1.Time;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        t1.time_s = 10;
        t2.time_s = 10000;
        t3.time_s = 100000;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}