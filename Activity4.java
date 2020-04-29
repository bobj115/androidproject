package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        String[] ML = new String[] {"Decision tree", "CNN", "Random Forest", "Deep Learning"};
        ListView listView =  (ListView) findViewById(R.id.ListView1);
        ListAdapter ListView1Adaptor  = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,ML);
        ListView ListView1;
        ListView1 = (ListView) findViewById(R.id.ListView1);
        ListView1.setAdapter(ListView1Adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String ML = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Activity4.this, ML, Toast.LENGTH_LONG).show();

            }
        });

    }
}
