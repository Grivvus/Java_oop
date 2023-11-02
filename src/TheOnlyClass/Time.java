package TheOnlyClass;

public class Time {
    int time_s;
    int secInDay = 86400;
    public int[] time;
    final int Hour, Minute, Second;

    public Time(int time){
        this.time_s = time;
        this.time = convertTime();
        this.Hour = this.time[0];
        this.Minute = this.time[1];
        this.Second = this.time[2];
    }

    public Time (int h, int m, int s){
        this.Hour = h;
        this.Minute = m;
        this.Second = s;

    }

    private int[] convertTime() {
        while (this.time_s > 86400) {
            this.time_s -= 86400;
        }
        int hour = this.time_s / 3600;
        int min = (this.time_s - (hour * 3600)) / 60;
        int sec = time_s - (hour * 3600 + min * 60);
        this.time = new int[]{hour, min, sec};
        return time;
    }
    public String toString(){
        return this.Hour + " " + this.Minute + " " + this.Second;
    }
}
