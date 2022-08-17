package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Student {
    private String birthday;
    private String studentName;
    private String studentSoName;
    private String studentEmail;

    @Override
    public String toString() {
        return "Студент{" +
                "Фамилиясы жана аты:'" + studentSoName + " " + studentName + '\'' +
                ", туулган куну:'" + birthday + '\'' +
                ", Электрондук дареги='" + studentEmail + '\'' +
                '}';
    }

    public Student(String birthday, String studentName, String studentSoName, String studentEmail) {
        LocalDate birthday1 = LocalDate.of(1974,4,19);
        LocalDate localdate1 = LocalDate.now();
        int a = localdate1.compareTo(birthday1);
        if (a > 0) {
        this.birthday = birthday;
        this.studentName = studentName;
        this.studentSoName = studentSoName;
        this.studentEmail = studentEmail;
    } else {
            System.out.println("Жашы ката корсотулгон");}
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        LocalDate birthday1 = LocalDate.of(1974, 4, 19);
        LocalDate localdate1 = LocalDate.now();
        int a = localdate1.compareTo(birthday1);
        if (a > 0) {
            this.birthday = birthday;
        } else {
            System.out.println("Жашы ката корсотулгон");
        }
    }

    public Student() {

    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSoName() {
        return studentSoName;
    }

    public void setStudentSoName(String studentSoName) {
        this.studentSoName = studentSoName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

}

