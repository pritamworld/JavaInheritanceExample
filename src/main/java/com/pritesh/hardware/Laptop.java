package com.pritesh.hardware;

public class Laptop extends Computer
{
    private String screenSize;
    private float weight;

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void display() {

    }
}
