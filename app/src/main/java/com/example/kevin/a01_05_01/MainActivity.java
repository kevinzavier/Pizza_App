package com.example.kevin.a01_05_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    CheckBox pepbox;
    CheckBox cheesebox;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pepbox = (CheckBox) findViewById(R.id.checkBox);
        cheesebox = (CheckBox) findViewById(R.id.checkBox2);
        textView = (TextView) findViewById(R.id.textView2);
        int i = 7;
        int j = plusOne(i);
    }

    public void onBottonClick(View view){
        Intent intent = new Intent(this, OtherActivity.class);
        intent.putExtra("Pepperoni", pepbox.isChecked());
        intent.putExtra("Extra cheese", cheesebox.isChecked());
        startActivity(intent);

        /*
        String str = "";
        if(pepbox.isChecked()){
            str = "Pepperoni";
        }
        if(cheesebox.isChecked()){
            str = "Extra Cheese";
        }
        if(pepbox.isChecked() && cheesebox.isChecked()){
            str = "Ahhhh yeeaaaa, eat up fatty :)";
        }
        if(!pepbox.isChecked() && !cheesebox.isChecked()){
            str = "plain :(";
        }
        Log.i("READ ME", "testview is chillin");
        textView.setText(str);
        //onKeyUp()
        */

    }

    private int plusOne(int i){
        return ++i;
    }
}
