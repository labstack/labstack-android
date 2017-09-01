package com.labstack.android;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Queue extends com.labstack.Queue {
    protected Queue(String accountId, String apiKey, IMqttAsyncClient client) throws MqttException {
        super(accountId, apiKey, client);
    }
}
