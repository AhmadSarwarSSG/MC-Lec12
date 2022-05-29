package com.firstapp.mc_lec11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> List=new ArrayList<String>();
    ListView listView;
    Button add;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.ViewList11);
        add=findViewById(R.id.button);
        txt=findViewById(R.id.input);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, List);
        listView.setAdapter(arrayAdapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txt.getText().toString().equals("")) {
                    List.add(txt.getText().toString());
                    txt.setText("");
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}