package com.company;

import java.util.Date;

public class Group {
    private String[] student;
    private String fakultet;
    private String date;

    public Group(String[] student, String fakultet, String date) {
        this.student = student;
        this.fakultet = fakultet;
        this.date = date;;
    }

    public Group() {

    }

    public String[] getStudent() {
        return student;
    }

    public void setStudent(String[] student) {
        this.student = student;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String hhh) {
        this.fakultet = hhh;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }
}
