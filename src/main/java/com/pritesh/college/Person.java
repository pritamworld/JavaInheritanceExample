package com.pritesh.college;

import com.pritesh.hardware.Computer;
import com.pritesh.other.IDisplay;

import java.util.Date;

public abstract class Person implements IDisplay {
    public String firstName;
    protected int id;
    private String lastName;
    private String gender;
    private String emailId;
    private Date birthDate;
    private Computer computer;

    public Person() {
    }

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param gender
     * @param emailId
     * @param birthDate
     * @param computer
     */
    public Person(int id, String firstName, String lastName, String gender, String emailId, Date birthDate, Computer computer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emailId = emailId;
        this.birthDate = birthDate;
        this.computer = computer;
    }

    public static void test() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    //public abstract void makeAbstract();
}
