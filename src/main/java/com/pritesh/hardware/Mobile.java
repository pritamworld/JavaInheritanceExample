package com.pritesh.hardware;

public class Mobile extends Computer {
    private String operatingSystemName;
    private boolean canMakeCall;
    private String providerName;//Rogers, Bell, Telus

    public Mobile() {
    }

    /**
     * @param operatingSystemName
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(String operatingSystemName, boolean canMakeCall, String providerName) {
        this.operatingSystemName = operatingSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    /**
     * @param id
     * @param manufacturerName
     * @param operatingSystemName
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(int id, String manufacturerName, String operatingSystemName, boolean canMakeCall, String providerName) {
        super(id, manufacturerName);
        this.operatingSystemName = operatingSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }


    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public void display() {

    }
}
