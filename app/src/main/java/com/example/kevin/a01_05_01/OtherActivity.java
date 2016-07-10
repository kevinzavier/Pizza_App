package com.example.kevin.a01_05_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_layout);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String str = "";
        if(intent.getBooleanExtra("Pepporoni", false)){
            str = "Pepperoni";
        }
        if(intent.getBooleanExtra("Extra Cheese",false)){
            str = "Extra Cheese";
        }
        if(intent.getBooleanExtra("Pepperoni", false) && intent.getBooleanExtra("Extra Cheese",false)){
            str = "Ahhhh yeeaaaa, eat up fatty :)";
        }
        /*
        if(!pepbox.isChecked() && !cheesebox.isChecked()){
            str = "plain :(";
        }
        */
        Log.i("READ ME", "testview is chillin");
        textView.setText(str);
        //onKeyUp()
    }
}
