
package com.ardic.example.kafka.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SensorDatum {

    @SerializedName("values")
    @Expose
    private List<String> values = null;
    @SerializedName("date")
    @Expose
    private Long date;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
