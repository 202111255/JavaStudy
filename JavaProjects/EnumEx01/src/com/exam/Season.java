package com.exam;

public enum Season {
    SPRING("봄"),
    SUMMER("여름"),
    AUTUMN("가을"),
    WINTER("겨울");

    private String season;

    private Season(String season) {
        System.out.println("생성자 : " + season);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
