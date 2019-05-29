package com.pritesh.hardware;

public class Laptop extends Computer
{
    private String screenSize;
    private float weight;

    public Laptop() {
    }

    /**
     *
     * @param screenSize
     * @param weight
     */
    public Laptop(String screenSize, float weight) {
        this.screenSize = screenSize;
        this.weight = weight;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param screenSize
     * @param weight
     */
    public Laptop(int id, String manufacturerName, String screenSize, float weight) {
        super(id, manufacturerName);
        this.screenSize = screenSize;
        this.weight = weight;
    }

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
