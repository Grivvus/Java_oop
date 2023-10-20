public class Time {
    int time_s;
    int secInDay = 86400;
    public int[] time;

    public Time(int time){
        this.time_s = time;
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
        int[] time = convertTime();
        return time[0] + " " + time[1] + " " + time[2];
    }
}
