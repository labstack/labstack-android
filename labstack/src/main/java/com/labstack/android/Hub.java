package com.labstack.android;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Hub extends com.labstack.Hub {
    protected Hub(String accountId, String apiKey, IMqttAsyncClient client) throws MqttException {
        super(accountId, apiKey, client);
    }
}
