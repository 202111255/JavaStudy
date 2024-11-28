package com.example.board.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PdsTO {
    private String seq;
    private String subject;
    private String writer;
    private String mail;
    private String password;
    private String content;
    private String filename;
    private String filesize;
    private String hit;
    private String wip;
    private String wdate;
    private int wgap;
}

