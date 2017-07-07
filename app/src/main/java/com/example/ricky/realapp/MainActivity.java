package com.example.ricky.realapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] species = {"Black Widow", "Sneaky Snake", "Fish"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start of the image button for snake
        list = (ListView) findViewById(R.id.list1);

        ArrayAdapter<String> myArray = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, species);
        list.setAdapter(myArray);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                Intent spider = new Intent(MainActivity.this, Main3Activity.class);

                if(position == 0)
                {
                    startActivity(intent);
                }
                else
                if(position==1){

                    startActivity(spider);
                }

            }
        });






  /*  @Override
    public void  onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView)view;
        Toast.makeText(this, "you click on"+ tv.getText(),Toast.LENGTH_SHORT).show();

    }*/
    }
}