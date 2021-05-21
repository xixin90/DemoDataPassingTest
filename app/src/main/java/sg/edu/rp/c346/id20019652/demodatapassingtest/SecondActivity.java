package sg.edu.rp.c346.id20019652.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2
        textView = findViewById(R.id.textView);
        Intent intentReceived = getIntent();

        int value = intentReceived.getIntExtra("value", 0);
        textView.setText("Integer value received is: " + value);

    }
}