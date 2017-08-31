package com.labstack.android;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;

public class Connect extends com.labstack.Connect {
    protected Connect(Client client, IMqttAsyncClient mqttClient, String clientId) throws org.eclipse.paho.client.mqttv3.MqttException {
        super(client, mqttClient, clientId);
    }
}
