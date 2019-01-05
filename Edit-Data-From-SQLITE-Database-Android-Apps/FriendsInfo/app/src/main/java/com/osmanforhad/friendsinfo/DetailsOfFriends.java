package com.osmanforhad.friendsinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DetailsOfFriends extends AppCompatActivity {
    //Create an object for ListView
    ListView lv;
    //Declare an String array
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_friends);
        //Initial the XML Layout within tv object
        lv = (ListView) findViewById(R.id.show_data);
         //Create an object for calling DbFunctions class
        DbFunctions df = new DbFunctions(getApplicationContext());
        /*call display_data with in string array
         which name is data
        for fetch data from display_data Method
        which is written within DbFunctions class*/
        data = df.display_data();
       /*Declare an Array Adapter for List view
       * and call here layout XML file custom_layout_item
        * and call xml id of text view from custom_layout_item file
        * and aslo initial String arry which name datas */
        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.custom_layout_item, R.id.disptext, data));
        /*for clickable row*/
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //For after click goto another page
                Intent enter = new Intent(getApplicationContext(), SingleData.class);
                enter.putExtra("passingData", position);
                startActivity(enter);
            }
        });
    }
}
