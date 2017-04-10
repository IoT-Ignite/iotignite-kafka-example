package com.ardic.example.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.ardic.example.kafka.model.ArcloudMessage;
import com.ardic.example.kafka.model.SensorDataExtras;
import com.ardic.example.kafka.model.SensorDatum;
import com.ardic.example.kafka.model.WebsocketSensorDataMessage;
import com.google.gson.Gson;

public class ArcloudKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(ArcloudKafkaConsumer.class);
	@Autowired
	private SimpMessagingTemplate template;
	
	private static final String DEVICE_INFO_KEY = "DeviceInfo";
	private static final String SENSOR_DATA_KEY = "SensorData";

	@KafkaListener(topics = "${tenantDomain}")
	public void receiveMessage(String message) {
		LOGGER.info("received message = " + message);

		ArcloudMessage messageObject = new Gson().fromJson(message, ArcloudMessage.class);

		if (DEVICE_INFO_KEY.equals(messageObject.getHeader().getType())) {
			if (SENSOR_DATA_KEY.equals(messageObject.getBody().getCommand())) {
				SensorDataExtras sensorDataMessage = new Gson().fromJson(messageObject.getBody().getExtras(), SensorDataExtras.class);
				for (SensorDatum data : sensorDataMessage.getSensorData()) {
					template.convertAndSend("/topic/sensor-data", new WebsocketSensorDataMessage(messageObject.getBody(), data));
				}
			} else {
				template.convertAndSend("/topic/presence", message);
			}

		}

	}
}
