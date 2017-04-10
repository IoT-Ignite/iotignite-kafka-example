package com.ardic.example.kafka.model;

import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

	@SerializedName("nodeId")
	@Expose
	private String nodeId;
	@SerializedName("sensorId")
	@Expose
	private String sensorId;
	@SerializedName("command")
	@Expose
	private String command;
	@SerializedName("messageId")
	@Expose
	private String messageId;
	@SerializedName("deviceId")
	@Expose
	private List<String> deviceId = null;
	@SerializedName("extras")
	@Expose
	private JsonElement extras;

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

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public List<String> getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(List<String> deviceId) {
		this.deviceId = deviceId;
	}

	public JsonElement getExtras() {
		return extras;
	}

	public void setExtras(JsonElement extras) {
		this.extras = extras;
	}

}
