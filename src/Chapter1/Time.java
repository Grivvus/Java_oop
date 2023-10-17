package Chapter1;

public class Time {
    public int time_s;
    int secInDay = 86400;

    private int[] convertTime() {
        while (time_s > 86400) {
            time_s -= 86400;
        }
        int hour = time_s / 3600;
        int min = (time_s - (hour * 3600))/60;
        int sec = time_s - (hour * 3600 + min * 60);

        int[] time = new int[] {hour, min, sec};
        return time;
    }
    public String toString(){
        int[] time = convertTime();
        return time[0] + " " + time[1] + " " + time[2];
    }
}