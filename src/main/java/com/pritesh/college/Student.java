package com.pritesh.college;

import com.pritesh.hardware.Computer;

import java.util.Date;

public class Student extends Person {
    static public int count;
    public final int X = 10;
    private String courseName;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String result;

    public Student() {
    }

    /**
     * @param courseName
     * @param marks
     * @param totalMarks
     * @param percentage
     * @param result
     */
    public Student(String courseName, float[] marks, float totalMarks, float percentage, String result) {
        this.courseName = courseName;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
    }

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param gender
     * @param emailId
     * @param birthDate
     * @param computer
     * @param courseName
     * @param marks
     * @param totalMarks
     * @param percentage
     * @param result
     */
    public Student(int id, String firstName, String lastName, String gender, String emailId, Date birthDate, Computer computer, String courseName, float[] marks, float totalMarks, float percentage, String result) {
        super(id, firstName, lastName, gender, emailId, birthDate, computer);
        this.courseName = courseName;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
    }

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

    public void calculateTotal() {
        this.totalMarks = 0.0f;

        for (int i = 0; i < this.marks.length; i++) {
            this.totalMarks = this.totalMarks + marks[i];
        }
    }

    public void calculatePercentage() {
        this.percentage = this.totalMarks / this.marks.length;
    }


    public void calculateResult() {
        int passedSubj = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50.0f) {
                passedSubj++;
            }
        }

        if (passedSubj <= 2) {
            this.result = "Fail";
        } else {
            if (this.percentage >= 94) {
                this.result = "A+";
            } else if (this.percentage > 87) {
                this.result = "A";
            } else if (this.percentage > 80) {
                this.result = "A-";
            } else if (this.percentage > 77) {
                this.result = "B+";
            } else if (this.percentage > 73) {
                this.result = "B";
            } else if (this.percentage > 70) {
                this.result = "B-";
            } else if (this.percentage > 67) {
                this.result = "C+";
            } else if (this.percentage > 63) {
                this.result = "c";
            } else if (this.percentage > 60) {
                this.result = "c-";
            } else if (this.percentage > 50) {
                this.result = "D";
            } else {
                this.result = "Fail";
            }
        }
    }

    @Override
    public void display() {

    }
}
