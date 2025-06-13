package com.myjava.practice.basics.homeworks;

public class SensorTemperature {
    public static void main(String[] args) {
        String[][] sensorData = {{"s1","s2","s3","s4"},{"28","20","27","40"}};

        int length = sensorData[0].length;

        for (int i=0; i<length; i++){
            System.out.println(sensorData[0][i]+ " " +sensorData[1][i]);
        }
    }
}
