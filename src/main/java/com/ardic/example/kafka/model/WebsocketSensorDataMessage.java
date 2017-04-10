package com.ardic.example.kafka.model;

public class WebsocketSensorDataMessage {

	private String deviceId;
	private String nodeId;
	private String sensorId;
	private String value;
	private Long date;

	public WebsocketSensorDataMessage(Body identity, SensorDatum data) {
		this.deviceId = identity.getDeviceId().get(0);
		this.nodeId = identity.getNodeId();
		this.sensorId = identity.getSensorId();
		
		this.value = data.getValues().get(0);
		this.date = data.getDate();

	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

}
