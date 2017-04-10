
package com.ardic.example.kafka.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Header {

    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("tryCount")
    @Expose
    private Integer tryCount;
    @SerializedName("dmId")
    @Expose
    private String dmId;
    @SerializedName("cloudMessageId")
    @Expose
    private String cloudMessageId;
    @SerializedName("date")
    @Expose
	private Long date;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tenantDomain")
    @Expose
    private String tenantDomain;
    @SerializedName("deviceId")
    @Expose
    private String deviceId;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getTryCount() {
        return tryCount;
    }

    public void setTryCount(Integer tryCount) {
        this.tryCount = tryCount;
    }

    public String getDmId() {
        return dmId;
    }

    public void setDmId(String dmId) {
        this.dmId = dmId;
    }

    public String getCloudMessageId() {
        return cloudMessageId;
    }

    public void setCloudMessageId(String cloudMessageId) {
        this.cloudMessageId = cloudMessageId;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}
