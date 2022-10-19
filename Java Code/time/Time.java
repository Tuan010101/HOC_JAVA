package time;

public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void nextSecond(){
        System.out.println("Cộng 1 giây:");
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = minute % 60;
            hour++;
        }
        if (hour >= 24) {
            hour = hour % 24;
        }
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return;
        }
        if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return;
        }
        if (second == 59) {
            minute++;
            second = 0;
            return;
        }
        second++;
    }

    public void previousSecond(){
        System.out.println("Trừ 1 giây:");
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = minute % 60;
            hour++;
        }
        if (hour >= 24) {
            hour = hour % 24;
        }
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return;
        }
        second--;
    }

    public void display(){
        System.out.println("Gio: " + this.hour + " Phut: " + this.minute + " Giay: " + this.second);
    }
}
