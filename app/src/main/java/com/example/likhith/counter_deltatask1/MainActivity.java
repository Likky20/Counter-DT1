package com.example.likhith.counter_deltatask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int i=0; //For Counter value
    private static int j=-1; //For Background colour changing
    TextView MTV;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MTV=(TextView)findViewById(R.id.MTV);
        MTV.setText(String.valueOf(i));
        background=(LinearLayout)findViewById(R.id.backgroud);
        if(j==-1)
            background.setBackgroundColor(Color.WHITE);
        if(j==0)
            background.setBackgroundColor(Color.BLUE);
        if(j==1)
            background.setBackgroundColor(Color.RED);
        if(j==2)
            background.setBackgroundColor(Color.YELLOW);
        if(j==3)
            background.setBackgroundColor(Color.MAGENTA);


    }

    public void counterButtonClicked(View view) {
        i++;
        j++;
        MTV.setText(String.valueOf(i));
        if(j>3)
            j=0;
        if(j==0)
            background.setBackgroundColor(Color.BLUE);
        if(j==1)
            background.setBackgroundColor(Color.RED);
        if(j==2)
            background.setBackgroundColor(Color.YELLOW);
        if(j==3)
            background.setBackgroundColor(Color.MAGENTA);



    }

    public void resetButtonClicked(View view) {
        i=0;
        j=-1;
        MTV.setText(String.valueOf(i));
        background.setBackgroundColor(Color.WHITE);
    }
}
