package com.pritesh.hardware;

public class Desktop extends  Computer
{
    private String keyBoardCompanyName;
    private String screenType;

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
}
