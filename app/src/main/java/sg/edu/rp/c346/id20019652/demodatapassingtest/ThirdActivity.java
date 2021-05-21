package sg.edu.rp.c346.id20019652.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        textView = findViewById(R.id.textView);
        Intent intentReceived = getIntent();

        char valueSelected = intentReceived.getCharExtra("value", 'a');
        textView.setText("Character value received is: " + valueSelected);

        //double value = intentReceived.getDoubleExtra("value", 99.99);
        //textView.setText("Double value received is: " + value);

    }
}