package com.pritesh.college;

import com.pritesh.hardware.Computer;

import java.util.Date;

public class Faculty extends Person {
    private String departmentName;
    private String designation;
    private Date joiningDate;
    private float salary;

    public Faculty() {
    }

    /**
     * @param departmentName
     * @param designation
     * @param joiningDate
     * @param salary
     */
    public Faculty(String departmentName, String designation, Date joiningDate, float salary) {
        this.departmentName = departmentName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param gender
     * @param emailId
     * @param birthDate
     * @param computer
     * @param departmentName
     * @param designation
     * @param joiningDate
     * @param salary
     */
    public Faculty(int id, String firstName, String lastName, String gender, String emailId, Date birthDate, Computer computer, String departmentName, String designation, Date joiningDate, float salary) {
        super(id, firstName, lastName, gender, emailId, birthDate, computer);
        this.departmentName = departmentName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("-----------------------------------------------");
        System.out.println("\t------------ FACULTY INFO -------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Faculty ID : " + this.getId());
        System.out.println("Full Name : " + this.getFullName());
        System.out.println("Gender : " + this.getGender());
        System.out.println("Birth Date : " + this.getBirthDate());

        if(getComputer() == null)
        {
            System.out.println("Faculty don't have any computer");
        }
        else
        {
            getComputer().display();
        }

        System.out.println("Department Name : " + this.getDepartmentName());
        System.out.println("Designation : " + this.getDesignation());
        System.out.println("Joining Date : " + this.getJoiningDate());
        System.out.println("Salary : " + this.getSalary());
        System.out.println("-----------------------------------------------");
    }

    @Override
    public void print() {

    }
}
