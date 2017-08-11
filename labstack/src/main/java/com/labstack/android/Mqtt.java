package com.labstack.android;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;

public class Mqtt extends com.labstack.Mqtt {
    protected Mqtt(Client client, IMqttAsyncClient mqttClient, String clientId) throws org.eclipse.paho.client.mqttv3.MqttException {
        super(client, mqttClient, clientId);
    }
}
