package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student[] stud = new Student[10];
        stud[0] = new Student("1974-04-19", "Асан", "Усонов", "asan@gmail.com");
        stud[1] = new Student("1982-01-05", "Бакыт", "Артыков", "bakyt@gmail.com");
        stud[2] = new Student("1995-06-03", "Малик", "Закиров", "malik@gmail.com");
        stud[3] = new Student("1990-04-30", "Усон", "Арипов", "uson@gmail.com");
        stud[4] = new Student("1985-02-25", "Кочор", "Самиров", "cochor@gmail.com");
        stud[5] = new Student("1983-06-13", "Айбек", "Данышев", "aiba@gmail.com");
        stud[6] = new Student("1979-05-08", "Салим", "Парпиев", "salim@gmail.com");
        stud[7] = new Student("1984-11-05", "Айнура", "Садирова", "nur@gmail.com");
        stud[8] = new Student("1998-06-23", "Каныкей", "Жапарова", "kany@gmail.com");
        stud[9] = new Student("2002-09-03", "Жибек", "Окумова", "jibek@gmail.com");

        Student[] stud1 = new Student[3];
        Student[] stud2 = new Student[3];
        Student[] stud3 = new Student[4];
        for (int i = 0; i < stud.length; i++) {
            if (i>4) {
            stud1[0] = stud[0];
            stud1[1] = stud[1];
            stud1[2] = stud[2];
            }
            if (i>2 && i>7) {
                stud2[0] = stud[3];
                stud2[1] = stud[4];
                stud2[2] = stud[5];
            }
            if (i>6) {
                stud3[0] = stud[6];
                stud3[1] = stud[7];
                stud3[2] = stud[8];
                stud3[3] = stud[9];
            }

        }



        Group[] groups = new Group[3];
        groups[0] = new Group(stud1, "ЭК-2-92", "1992-01-09");
        groups[1] = new Group(stud2, "Финансы", "1992-01-09");
        groups[2] = new Group(stud3, "Бухгалтерия", "1992-01-09");

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

        System.out.println("Курстун аты: " + course.getCourseName() + " номери: " + course.getCourseNumber() + " Курстун мугалими: " + course.getCourseNameTeacher() + " Груупалар:" + Arrays.toString(course.getGroups()));



    }
    }

