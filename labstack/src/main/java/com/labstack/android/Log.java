package com.labstack.android;

import android.os.StrictMode;

import com.labstack.Fields;
import com.labstack.LogCallback;
import com.labstack.LogException;

public class Log extends com.labstack.Log implements Thread.UncaughtExceptionHandler {
    private LogCallback defaultLogCallback = new LogCallback() {
        @Override
        public void onSuccess() {
        }

        @Override
        public void onError(LogException e) {
            e.printStackTrace();
        }
    };

    protected Log(Client client) {
        super(client);
    }

    @Override
    public void debug(Fields fields) {
        super.debug(fields, defaultLogCallback);
    }

    @Override
    public void info(Fields fields) {
        super.info(fields, defaultLogCallback);
    }

    @Override
    public void warn(Fields fields) {
        super.warn(fields, defaultLogCallback);
    }

    @Override
    public void error(Fields fields) {
        super.error(fields, defaultLogCallback);
    }

    @Override
    // Automatically report uncaught fatal error
    public void uncaughtException(Thread thread, Throwable throwable) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        fatal(new Fields()
                .add("message", throwable.getMessage())
                .add("stack_trace", getStackTrace(throwable)));
        defaultUncaughtExceptionHandle.uncaughtException(thread, throwable);
    }
}
