package com.labstack.android;

import android.content.Context;

import com.labstack.MessageException;

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

    public Message message(String clientId) throws MessageException {
        try {
            IMqttAsyncClient mqttClient = new MqttAndroidClient(context, Client.MQTT_BROKER, clientId);
            return new Message(this.accountId, this.apiKey, mqttClient);
        } catch (MqttException e) {
            throw new MessageException(e.getReasonCode(), e.getMessage());
        }
    }
}

