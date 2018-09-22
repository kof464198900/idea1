package com.ipc.domain;

import java.util.Date;

public class Users {
    private String name;
    private int age;
    private Date time;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
