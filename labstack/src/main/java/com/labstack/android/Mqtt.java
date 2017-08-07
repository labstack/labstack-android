package com.labstack.android;

import android.content.Context;

import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;

public class Mqtt extends com.labstack.Mqtt {
    protected Mqtt(Context context, String accountId, String apiKey, String clientId, IMqttAsyncClient client) throws org.eclipse.paho.client.mqttv3.MqttException {
        super(accountId, apiKey, clientId, client);
    }
}
