package com.company;

import java.util.Arrays;

public class Сourse extends Group{

    private String courseName;
    private int courseNumber;
    private String courseNameTeacher;
    private Group[] groups;


    public Сourse(String courseName, int courseNumber, String courseNameTeacher, Group[] groups) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseNameTeacher = courseNameTeacher;
        this.groups = groups;
    }

    public Сourse() {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseNameTeacher() {
        return courseNameTeacher;
    }

    public void setCourseNameTeacher(String courseNameTeacher) {
        this.courseNameTeacher = courseNameTeacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Сourse{" +
                "groups=" + Arrays.toString(groups) +
                '}';
    }
}
