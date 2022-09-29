package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.security.Provider;
import java.security.Security;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder builder = new StringBuilder();
        for (Provider provider : Security.getProviders()) {
            builder.append("provider:")
                    .append(provider.getName())
                    .append(" ")
                    .append(provider.getVersion())
                    .append("   +")
                    .append(provider.getInfo())
                    .append(" &&");
        }
        String providers = builder.toString();
        Log.e("water","provider = " + providers);
    }
}
