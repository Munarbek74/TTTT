package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Student student = new Student();
       student.setStudentDate("1974-04-19");
       student.setStudentName("Munarbek");
       student.setStudentSoName("Shorokhov");
       student.setStudentEmail("12345@gmail.com");

       if (student.getStudentDate() != null){
       System.out.println("Студенттин фамилиясы жана аты: " + student.getStudentSoName() + " " + student.getStudentName() + " электрондук дареги: " + student.getStudentEmail() + " туулган куну: " + student.getStudentDate());
        }
        System.out.println();
       Group group = new Group();
       group.setStudent(new String[]{"Asanov U.", "Usonov A", "<Barytov H.", "Daminov B."});
       group.setDate("1992-09-01");
       group.setFakultet("Economica");

        System.out.println("Студенты: " + Arrays.toString(group.getStudent()) + " Факультет: " + group.getFakultet() + " Дата начала обучения: " + group.getDate());
        System.out.println();
        Сourse course = new Сourse();
        course.setCourseName("ЭК-1-92");
        course.setCourseNumber(1);
        course.setCourseNameTeacher("Балтабаев Т.");
        course.setCourseGroupName(new String[] {"ЭК-2-92", "Бухгалтерия", "Финансы жана кредит", "Банковское дело"});

        System.out.println("Курстун аты: " + course.getCourseName() + " номери: " + course.getCourseNumber() + " Курстун мугалими: " + course.getCourseNameTeacher() + " Груупалар:" + Arrays.toString(course.getCourseGroupName()));



    }
    }

