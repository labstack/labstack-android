package com.labstack.android;

import android.content.Context;

import com.labstack.QueueException;

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

    public Queue queue(String clientId) throws QueueException {
        try {
            IMqttAsyncClient mqttClient = new MqttAndroidClient(context, Client.MQTT_BROKER, clientId);
            return new Queue(this.accountId, this.apiKey, mqttClient);
        } catch (MqttException e) {
            throw new QueueException(e.getReasonCode(), e.getMessage());
        }
    }
}

