/*
 * Copyright (c) 2015 Kloudtek Ltd
 */

package com.kloudtek.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AbstractActivity {
    public DoStuff s = new DoStuff();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InputStream r = getClass().getResourceAsStream("/test.properties");
        Log.e("XXXX",">>>>> "+r);
        try {
            String s = IOUtils.toString(r);
            Log.e("XXXX","?????? "+this.s.getClass().getName());
            Log.e("XXXX","----- "+s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
