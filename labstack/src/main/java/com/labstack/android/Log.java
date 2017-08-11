package com.labstack.android;

import android.os.AsyncTask;

import com.labstack.*;

public class Log extends com.labstack.Log {

    private class Dispatch extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Log.super.dispatch();
            return null;
        }
    }

    protected Log(Client client) {
        super(client);
    }

    @Override
    protected void dispatch() throws LogException {
        new Dispatch().execute();
    }

    @Override
    public void debug(Fields fields) {
        super.debug(fields);
    }

    @Override
    public void info(Fields fields) {
        super.info(fields);
    }

    @Override
    public void warn(Fields fields) {
        super.warn(fields);
    }

    @Override
    public void error(Fields fields) {
        super.error(fields);
    }

    @Override
    public void fatal(Fields fields) {
        super.fatal(fields);
    }
}
