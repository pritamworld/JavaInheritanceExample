package com.pritesh.hardware;

import com.pritesh.other.IDisplay;

public abstract class Computer implements IDisplay {
    private int id;
    private String manufacturerName;

    public Computer() {
        //BLANK CONSTRUCTOR

        System.out.println("Computer Constructor");
    }

    /**
     * @param id
     * @param manufacturerName
     */
    public Computer(int id, String manufacturerName) {
        this.id = id;
        this.manufacturerName = manufacturerName;
        System.out.println("Computer Parameter");
    } //Parameterised Constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
