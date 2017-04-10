package com.ardic.example.kafka.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SensorDataExtras {

    @SerializedName("formatVersion")
    @Expose
    private String formatVersion;
    @SerializedName("sensorData")
    @Expose
    private List<SensorDatum> sensorData = null;

    public String getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    public List<SensorDatum> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorDatum> sensorData) {
        this.sensorData = sensorData;
    }
}
