package com.tempdata.beans;

public class HumiditySensor implements Sensor{
    private float Humidity;

    public void setHumidity(float humidity) {
        this.Humidity = humidity;
    }

    public float getHumidity() {
        return Humidity;
    }

    public float getReading() {
        return 0;
    }

    /**
     * @return
     */

    public float setReading() {
        return 0;
    }

    /**
     * @param Unit
     * @return
     */
    @Override
    public float getReading(String Unit) {
        return 0;
    }

    /**
     * @param Unit
     * @return
     */
    @Override
    public float getReading(ReadingUnit Unit) {
        return 0;
    }
}
