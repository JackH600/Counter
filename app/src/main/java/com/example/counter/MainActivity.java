package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Counter mcounter;
    TextView mcountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcounter = new Counter();
        mcountTextView = (TextView)findViewById(R.id.textview);
    }

    public void increase(View v){
        mcounter.addCount();
        mcountTextView.setText(mcounter.getCount().toString());
    }

    public void reset(View v)
    {
        mcounter.resetCount();
        mcountTextView.setText(mcounter.getCount().toString());
    }

}
