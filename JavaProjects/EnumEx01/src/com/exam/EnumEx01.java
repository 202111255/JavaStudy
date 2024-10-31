package com.exam;

public class EnumEx01 {
    public static void main(String[] args) {
        Week monday = Week.MONDAY;

        //열거형의 이름
        System.out.println(monday);
        System.out.println(Week.MONDAY);

        //메서드
        String name = monday.name();
        System.out.println(name);

        int weekNum = monday.ordinal(); //순서값
        System.out.println(weekNum);

        Week friday = Week.FRIDAY;
        weekNum = friday.ordinal(); //순서값
        System.out.println(weekNum);

        //compareTo
        Week day1 = Week.MONDAY;
        Week day2 = Week.FRIDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        Week day = Week.valueOf("SUNDAY");
        System.out.println(day);

        Week[] days = Week.values();
        for (Week week : days) {
            System.out.println(week);
        }
    }
}
