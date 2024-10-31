package com.exam;

import java.util.Calendar;

public class EnumEx02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //Calendar.WEEK_OF_YEAR - Enum을 사용한 옵션
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
    }
}
