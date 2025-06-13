package com.tempdata.beans;

public interface Sensor {
    public float getReading();
    public float getReading(String Unit);

    float getReading(ReadingUnit Unit);
}
