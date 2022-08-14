package com.company;

public class Сourse {

    private String courseName;
    private int courseNumber;
    private String courseNameTeacher;
    private String[] courseGroupName;

    public Сourse(String courseName, int courseNumber, String courseNameTeacher, String[] courseGroupName) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseNameTeacher = courseNameTeacher;
        this.courseGroupName = courseGroupName;
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

    public String[] getCourseGroupName() {
        return courseGroupName;
    }

    public void setCourseGroupName(String[] courseGroupName) {
        this.courseGroupName = courseGroupName;
    }
}
