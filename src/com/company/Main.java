package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student[] stud = new Student[3];
        stud[0] = new Student("1974-04-19", "Асан", "Усонов", "asan@gmail.com");
        stud[1] = new Student("1982-01-05", "Бакыт", "Артыков", "bakyt@gmail.com");
        stud[2] = new Student("1995-06-03", "Малик", "Закиров", "malik@gmail.com");

        Group[] groups = new Group[3];
        groups[0] = new Group(stud, "123", "321");
        groups[1] = new Group(stud, "123", "321");
        groups[2] = new Group(stud, "123", "321");

        Group group = new Group();
        group.setStudents(stud);
        group.setDate("1991-01-09");
        group.setFakultet("Экономика");
        System.out.println("Студенты: " + Arrays.toString(group.getStudents()) + " Факультет: " + group.getFakultet() + " Дата начала обучения: " + group.getDate());
        System.out.println();



        Сourse course = new Сourse();
        course.setCourseName("ЭК-1-92");
        course.setCourseNumber(1);
        course.setCourseNameTeacher("Балтабаев Т.");
        course.setGroups(groups);

        System.out.println("Курстун аты: " + course.getCourseName() + " номери: " + course.getCourseNumber() + " Курстун мугалими: " + course.getCourseNameTeacher() + " Груупалар:" + course.getGroups());



    }
    }

