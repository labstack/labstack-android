package com.labstack.android;

import android.content.Context;

import com.labstack.HubException;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Client extends com.labstack.Client {
    private Context context;

    public Client(Context context, String accountId, String apiKey) {
        super(accountId, apiKey);
        this.context = context;
    }

    public Hub message(String clientId) throws HubException {
        try {
            IMqttAsyncClient mqttClient = new MqttAndroidClient(context, Client.MQTT_BROKER, clientId);
            return new Hub(this.accountId, this.apiKey, mqttClient);
        } catch (MqttException e) {
            throw new HubException(e.getReasonCode(), e.getMessage());
        }
    }
}

