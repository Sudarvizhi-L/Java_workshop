package com.tempdata.beans;

public class TemperatureSensor implements Sensor {
    private float temperature; // deffault Celsius

    public TemperatureSensor(float temperature) {
        this.temperature = temperature;
    }


    public float getReading() {
        return temperature; // returns in defaultunit
    }

    @Override
    public float getReading(String Unit) {
        return 0;
    }

    @Override
    public float getReading(ReadingUnit Unit) {
        if (Unit == null) return getReading();

        switch (Unit) {
            case ReadingUnit.F:
                return (temperature * 9 / 5) + 32;
            default:
                return temperature;
        }
    }

    @Override
    public String toString(){
        return "temp" + temperature;
    }
}
