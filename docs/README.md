## IoT-Ignite PubSub Service Sample Application

This application demonstrates how to subscribe IoT-Ignite PubSub Service and stream incoming data to websocket in order to visualize data.

This application powered by SpringBoot and uses Kafka Client in order to subscribe to IoT-Ignite PubSub Service. This application also implements websocket server in order to stream incoming messages to web interface.

In order to use this application you need to contact [IoT-Ignite Support](https://www.iot-ignite.com/contact/) to get your keytab file. Once your account enabled to use IoT-Ignite PubSub service we will send you Kerberos Principal keytab and kerberos configuration files. Please use this files as startup parameters of this application. Also you must change the tenantDomain parameter in /src/main/resources/application.propeties to your tenantDomain name. After making required changes you can build application with maven and start with the parameters below.

```bash

$ mvn clean install
$ cd target
$ java -Djava.security.auth.login.config=/home/baris/CONF/KEYTABS/birbencom_jaas.conf -Djava.security.krb5.conf=/etc/krb5.conf -jar iotignite-kafka-example-0.1.0.jar

After building and starting server go to your browser and open [http://localhost:8080] If any of your devices using [IoT Ignite Demo Application](https://github.com/IoT-Ignite/android-example-IoTIgniteDemoApp) Temperature and Humidity values will be appeared on webpage. Also all device messages will be streamed to web page console div.



_**Iot-Ignite PubSub Service Sample Application**_ developed by IoT-Ignite.
