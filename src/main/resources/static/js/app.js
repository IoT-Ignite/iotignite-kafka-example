function setConnected(connected) {

    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $('.open-socket').hide();
        $('.close-socket').show();
            }
    else {
        $('.open-socket').show();
        $('.close-socket').hide();
    }
   
}

function openSocketConnection() {

    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/sensor-data', function (message) {

        	console.log(message);
        	var sensorData = JSON.parse(message.body);
        	$('#deviceId').text(sensorData.deviceId);
        	if(sensorData.sensorId == "Temperature"){
        		$('.temp-status').text(sensorData.value);
        	} else if (sensorData.sensorId == "Humidity"){
        		$('.hum-status').text(sensorData.value);
        	}
        });
        stompClient.subscribe('/topic/presence', function (message) {
        	var jsonMessage = JSON.parse(message.body);
        	if(jsonMessage.body.command == "Presence"){
        		$('#summary').append(jsonMessage.body.deviceId[0] + " : " + jsonMessage.body.extras.state + "<br>").show();
        	} if(jsonMessage.body.command == "DeviceNodePresence"){
        		$('#summary').append(jsonMessage.body.deviceId[0] + "." + jsonMessage.body.extras[0].nodeId + "." + jsonMessage.body.extras[0].thingId + " : " + jsonMessage.body.extras[0].description + "<br>").show();
        		if(jsonMessage.body.extras[0].thingId == "Temperature"){
        			if(jsonMessage.body.extras[0].connected === 1){
        				$("#temp-label").css({'color':'green'});
        			} else {
        				$("#temp-label").css({'color':'red'});
        			}
        		} else if (jsonMessage.body.extras[0].thingId == "Humidity"){
        			if(jsonMessage.body.extras[0].connected === 1){
        				$("#hum-label").css({'color':'green'});
        			} else {
        				$("#hum-label").css({'color':'red'});
        			}
        		} 
        	}
        });
    });
}

function closeSocketConnection() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}
