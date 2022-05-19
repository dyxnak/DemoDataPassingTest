package sg.edu.rp.c346.id21035817.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    // step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        // step 2
        tvAnswer = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 99.99);
        tvAnswer.setText("Double value received is: " + value);
    }
}