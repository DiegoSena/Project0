package com.example.diegoguimaraes.project0;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00B2E6"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
    }

    public void sendMessage(View view){
        Toast toast = Toast.makeText(this, String.format("This button will launch my %s app!", ((Button)view).getText().toString().toLowerCase()), Toast.LENGTH_SHORT);
        toast.show();
    }
}
