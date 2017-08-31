package com.labstack.android;

import android.content.Context;

import com.labstack.ConnectException;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Client extends com.labstack.Client {
    private Context context;

    public Client(Context context, String accountId, String apiKey) {
        super(accountId, apiKey);
        this.context = context;
    }

    public Log log() {
        return new Log(this);
    }

    public Connect connect(String clientId) throws ConnectException {
        try {
            IMqttAsyncClient mqttClient = new MqttAndroidClient(context, Client.MQTT_BROKER, clientId);
            return new Connect(this, mqttClient, clientId);
        } catch (MqttException e) {
            throw new ConnectException(e.getReasonCode(), e.getMessage());
        }
    }
}

