package com.labstack.android;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Connect extends com.labstack.Connect {
    protected Connect(String accountId, String apiKey, IMqttAsyncClient client) throws MqttException {
        super(accountId, apiKey, client);
    }
}
