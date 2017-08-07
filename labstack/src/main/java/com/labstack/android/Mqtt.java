package com.labstack.android;

import android.content.Context;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Mqtt extends com.labstack.Mqtt {
    protected Mqtt(Context context, String accountId, String apiKey, String clientId, IMqttAsyncClient client) throws MqttException {
        super(accountId, apiKey, clientId, client);
    }
}
