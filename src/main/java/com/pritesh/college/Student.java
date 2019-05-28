package com.pritesh.college;

public class Student extends Person
{
    private String courseName;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String result;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
    }
}
