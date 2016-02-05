package com.example.quade.favoritescripture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.EXTRA_SCRIPTURE);
        String display = "Your favorite scripture is\n" + scripture;

        TextView tv = new TextView(this);
        tv.setText(display);
        tv.setTextSize(40);
        tv.setGravity(Gravity.CENTER);

        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(tv);
    }
}
