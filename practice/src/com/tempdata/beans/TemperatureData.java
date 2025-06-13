package com.tempdata.beans;

public class TemperatureData {
    public static void main(String[] args) {
        Residential residential = new Residential(null,0,0);
        System.out.println(residential.getType());
        residential.setType("Individual House");
        System.out.println(residential.getType());
        Residential flats = new Residential(null,0,0);
        System.out.println(flats.getType());
        flats.setType("apartments");
        System.out.println(flats.getType());

    }
}
