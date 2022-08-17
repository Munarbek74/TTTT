package com.company;

import java.util.Date;

public class Group extends Student{
    private String fakultet;
    private String date;

    @Override
    public String toString() {
        return "{" + fakultet + '\'' +
                '}';
    }

    private Student[] students;



        public Group(Student[] students, String fakultet, String date) {
        this.students = students;
        this.fakultet = fakultet;
        this.date = date;
    }

    public Group() {

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {

        this.students = students;
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
