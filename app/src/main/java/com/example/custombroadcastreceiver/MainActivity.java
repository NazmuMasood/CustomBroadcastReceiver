package com.example.custombroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastCustomIntent(View view){
        Intent intent = new Intent("MyCustomIntent");

        EditText et = findViewById(R.id.extraIntent);
        //add data to the intent
        intent.putExtra("message",(CharSequence)et.getText().toString());
        intent.setAction(".A_CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
