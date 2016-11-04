package com.example.ossmac.jsustudentsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class DisplayMessageActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        mListView = (ListView) findViewById(R.id.recipe_list_view);
        String[] listItems = {message};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
         mListView.setAdapter(adapter);
        //TextView textView = new TextView(this);
       // textView.setTextSize(40);
       // textView.setText(message);

       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        //layout.addView(textView);
    }
}
