package com.osmanforhad.friendsinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SingleData extends AppCompatActivity {
    //Create object for XML input
    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_data);
        //Initial XML Layout within edit object using XML id
        edit = (EditText) findViewById(R.id.editText);
        //Initial XML Layout within btn object using XML id
        btn = (Button) findViewById(R.id.btnupdate);

        //variable For capture indivisual click from listview
        int position_ofData = getIntent().getIntExtra("passingData",999);
        /*For showing data from Sqlite Db to text view
         using position_ofData variable*/
        //1st create an object for get DbFuction class
        DbFunctions dbOperation = new DbFunctions(getApplicationContext());
        //create an object for Store data after query
        String value = dbOperation.fetch_contact(position_ofData+1);
        //Display value with in edit field
        edit.setText(value);
        //For Cursor position into end of text
        edit.setSelection(edit.getText().length());

    }
}
