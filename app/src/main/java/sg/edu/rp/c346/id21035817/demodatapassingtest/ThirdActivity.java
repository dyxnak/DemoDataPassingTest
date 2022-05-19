package sg.edu.rp.c346.id21035817.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    // step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // step 2
        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        tvAnswer.setText("Character value received is: " + value);
    }
}