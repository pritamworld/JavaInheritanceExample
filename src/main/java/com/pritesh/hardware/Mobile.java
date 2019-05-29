package com.pritesh.hardware;

public class Mobile extends Computer
{
    private String operatingSystemName;
    private boolean canMakeCall;
    private String providerName;//Rogers, Bell, Telus


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
