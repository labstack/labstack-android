package com.labstack.android;

import android.content.Context;

import com.labstack.MqttException;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;

public class Client extends com.labstack.Client {
    private Context context;

    public Client(Context context, String accountId, String apiKey) {
        super(accountId, apiKey);
        this.context = context;
    }

    public Mqtt mqtt(String clientId) throws MqttException {
        try {
            IMqttAsyncClient client = new MqttAndroidClient(context, Client.MQTT_BROKER, clientId);
            return new Mqtt(context, getAccountId(), getApiKey(), clientId, client);
        } catch (org.eclipse.paho.client.mqttv3.MqttException e) {
            throw new MqttException(e.getReasonCode(), e.getMessage());
        }
    }
}

