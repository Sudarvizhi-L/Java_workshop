package com.tempdata.beans;

import java.util.Calendar;

public final class Residential extends Building {
    private String type;

    public Residential(String name, float height, int squareFeet) {
        super(name, height, squareFeet);
    }

    public void setType(String aType){
        type = aType;
    }
    public String getType(){
        return type;
    }
    @Override
    public void getEBBill() {

    }
}
