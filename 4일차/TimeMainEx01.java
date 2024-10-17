class Time {
    private int hour;
    private int minute;
    private int second;

    //생성자 (멤버필드 초기화)
    public Time(int hour, int minute, int second) {
        // this.hour = hour;
        // this.minute = minute;
        // this.second = second;
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    //setter/getter
    public void setHour(int hour) {
        //이런식으로 검사 루틴을 작성해줄 수 있다.
        if (hour < 0 || hour >= 24) {
            hour = 0;
        } else {
            this.hour = hour;
        }
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 60) {
            minute = 0;
        } else {
            this.minute = minute;
        }
    }
    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 60) {
            second = 0;
        } else {
            this.second = second;
        }
    }
    public int getSecond() {
        return second;
    }
}

public class TimeMainEx01 {
    public static void main(String[] args) {
        Time t = new Time(10, 10, 10);
        
        //잘못된 데이터
        // t.hour = 25;
        // t.minute = 70;
        // t.second = 100;

        t.setHour(12);
        t.setMinute(30);
        t.setSecond(40);

        System.out.println(t.getHour() + "시");
        System.out.println(t.getMinute() + "분");
        System.out.println(t.getSecond() + "초");
    }
}
