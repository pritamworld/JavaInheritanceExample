package com.pritesh.hardware;

public class Desktop extends Computer {
    private String keyBoardCompanyName;
    private String screenType;

    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    /**
     * @param keyBoardCompanyName
     * @param screenType
     */
    public Desktop(String keyBoardCompanyName, String screenType) {
        super();
        this.keyBoardCompanyName = keyBoardCompanyName;
        this.screenType = screenType;

        System.out.println("Desktop D2");
    }

    /**
     * @param id
     * @param manufacturerName
     * @param keyBoardCompanyName
     * @param screenType
     */
    public Desktop(int id, String manufacturerName, String keyBoardCompanyName, String screenType) {
        super(id, manufacturerName);
        this.keyBoardCompanyName = keyBoardCompanyName;
        this.screenType = screenType;
    }

    public String getKeyBoardCompanyName() {
        return keyBoardCompanyName;
    }

    public void setKeyBoardCompanyName(String keyBoardCompanyName) {
        this.keyBoardCompanyName = keyBoardCompanyName;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public void display() {
        System.out.println("----- Desktop Information -----");
        System.out.println("Device ID : " + this.getId());
        System.out.println("Manufacturer Name : " + this.getManufacturerName());
        System.out.println("Keyboard Company Name : " + this.getKeyBoardCompanyName());
        System.out.println("Screen Type : " + this.getScreenType());
    }
}
