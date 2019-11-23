package com.example.android.threebuttons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
    // CAN ONLY HAVE ONE
    public static final String EXTRA_PASSAGE = "com.example.android.threebuttons.extra.PASSAGE";

    // Unique tag for intent extra -- CAN ONLY HAVE ONE
    public static final int TEXT_REQUEST = 1;

    private TextView passage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // initialize textview
        passage = findViewById(R.id.passage);
        // Put message into passage textview
        TextView textView = passage;

        // Get the intent that launched activity and passage in first intent extra
        Intent intent1 = getIntent();
        String passage1 = intent1.getStringExtra(MainActivity.EXTRA_PASSAGE);
        textView.setText(passage1);

        // Get intent for 2nd passage and put into textview
        Intent intent2 = getIntent();
        String passage2 = intent2.getStringExtra(MainActivity.EXTRA_PASSAGE);
        textView.setText(passage2);

        // Get intent for 3rd passage
        Intent intent3 = getIntent();
        String passage3 = intent3.getStringExtra(MainActivity.EXTRA_PASSAGE);
        textView.setText(passage3);

    }


    /**
     * Handles the data in the return intent from SecondActivity.
     *
     * @param requestCode Code for the SecondActivity request.
     * @param resultCode Code that comes back from SecondActivity.
     * @param data Intent data sent back from SecondActivity.
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Test for 1st passage intent
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String firstPassage = data.getStringExtra(SecondActivity.EXTRA_PASSAGE);
                // Make the selected passage visible
                passage.setText(firstPassage);
                passage.setVisibility(View.VISIBLE);

                String secondPassage = data.getStringExtra(SecondActivity.EXTRA_PASSAGE);
                // Make the selected passage visible
                passage.setText(secondPassage);
                passage.setVisibility(View.VISIBLE);

                String thirdPassage = data.getStringExtra(SecondActivity.EXTRA_PASSAGE);
                // Make the selected passage visible
                passage.setText(thirdPassage);
                passage.setVisibility(View.VISIBLE);
            }
        }
    }
}
