package com.example.walle2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        Toast.makeText(this,"渠道："+channel,Toast.LENGTH_LONG).show();
    }
}
