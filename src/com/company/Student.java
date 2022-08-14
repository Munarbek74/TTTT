package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Student {
    private String studentDate;
    private String studentName;
    private String studentSoName;
    private String studentEmail;

    public Student(String studentDate, String studentName, String studentSoName, String studentEmail) {
        LocalDate localdate = LocalDate.parse(studentDate);
        LocalDate localdate1 = LocalDate.now();
        int a = localdate.compareTo(localdate1);
        if (a > 0) {
        this.studentDate = studentDate;
        this.studentName = studentName;
        this.studentSoName = studentSoName;
        this.studentEmail = studentEmail;
    } else {
            System.out.println("Жашы ката корсотулгон");}
    }

    public String getStudentDate() {
        return studentDate;
    }

    public void setStudentDate(String studentDate) {
        LocalDate localdate = LocalDate.parse(studentDate);
        LocalDate localdate1 = LocalDate.now();
        int a = localdate1.compareTo(localdate);
        if (a > 0) {
            this.studentDate = studentDate;
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

