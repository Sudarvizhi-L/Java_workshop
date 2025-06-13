package com.tempdata.beans;

import java.util.Calendar;

public final class Commercial extends Building {

    private Calendar openHours;
    private Calendar closeHours;

    public void setOpenHours(Calendar openHours){ this.openHours = openHours;}
    public Calendar getOpenHours(){ return openHours; }
    public void setCloseHours(Calendar closeHours){
        this.closeHours = closeHours;
    }

    public Calendar getCloseHours() {
        return closeHours;
    }



    public Commercial(String buildingName, float height, int squareFeet, Calendar openHours, Calendar closeHours){
        super(buildingName,height, squareFeet);
        this.openHours = openHours;
        this.closeHours = closeHours;

    }

    public static class Parking{
        public void print(){
            System.out.println("parking of some building");
        }

    }


    /**
     *
     */
    @Override
    public void getEBBill() {

    }
}
