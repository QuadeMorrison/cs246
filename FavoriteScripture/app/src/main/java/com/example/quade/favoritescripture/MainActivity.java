package com.example.quade.favoritescripture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public final static String EXTRA_SCRIPTURE = "com.example.quade.favoritescripture.SCRIPTURE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendScripture(View view) {
        EditText book = (EditText) findViewById(R.id.book);
        EditText chapter = (EditText) findViewById(R.id.chapter);
        EditText verse = (EditText) findViewById(R.id.verse);
        String scripture = book.getText().toString() + " " +
                           chapter.getText().toString() + ":" +
                           verse.getText().toString();

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(EXTRA_SCRIPTURE, scripture);
        startActivity(intent);
    }
}
