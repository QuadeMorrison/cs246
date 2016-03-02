package com.cs246.sharedpreferences;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String PREF_NAME = "preferences";
    private int count = 0;
    private SharedPreferences preferences = null;
    private TextView countTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(PREF_NAME, 0);
        count = preferences.getInt("count", 0);

        countTextView = (TextView) findViewById(R.id.count);
        countTextView.setText(Integer.toString(count));
    }

    public void incrementCountHandler(View view) {
        TextView countTextView = (TextView) findViewById(R.id.count);
        count++;
        countTextView.setText(Integer.toString(count));
    }

    public void saveCountHandler(View view) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("count", count);
        editor.commit();
    }
}
