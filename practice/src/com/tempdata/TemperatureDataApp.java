package com.tempdata;

import com.tempdata.beans.*;

public class TemperatureDataApp {

    public static void main(String[] args) {
//        Commercial.Parking commercialParking = new Commercial.Parking();
//        commercialParking.print();
        Sensor tempSensor = new TemperatureSensor(24);
        System.out.println(tempSensor.getReading());
        System.out.println(tempSensor.getReading(ReadingUnit.F));
        System.out.println(tempSensor.getReading(ReadingUnit.C));

        System.out.println(tempSensor.getClass());
        System.out.println(tempSensor.hashCode());
        System.out.println(tempSensor.toString());

        Sensor innoruTempSensor = new TemperatureSensor(44);
        System.out.println(tempSensor == innoruTempSensor);


    }
}


