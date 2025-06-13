package com.tempdata.beans;

public sealed abstract class Building permits Residential, Commercial {
    private Floor[] floors;
    private String color;
    private String shape;
    private String name;
    private String noOfFloors;
    private float height;
    private int squareFeet;
    private boolean parkingsAvailable;
   public abstract void getEBBill();

    public Building(String name, float height, int squareFeet){
        this.name = name;
        this.height = height;
        this.squareFeet = squareFeet;
    }

}
