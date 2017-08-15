//M Bilal
//BCS02151060
//SEC A
//UNDER GUIDEANCE OF Respected: Sir Abdul Wahab and Sir Nouman Zafar

package com.example.mhassan.quotes_appx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listview);
        final String[] values = new String[]{"Love Quotes","Life Quotes","Motivation Quotes","Hope Quotes","Courtesy Quotes","Library Quotes","Memories Quotes","House Quotes","Sports","FriendShip Quotes","Success Quotes","Gentleman Quotes","Teachers Quotes" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item,android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,0);
                }

                if(position==1){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==3){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==4){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==5){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==6){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==7){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==8){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==9){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==10){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==11){
                    Intent myintent = new Intent(view.getContext(),LifeQuotes.class);
                    startActivityForResult(myintent,2);

                }
                if(position==12){
                    Intent myintent = new Intent(view.getContext(),LoveQuotes.class);
                    startActivityForResult(myintent,2);

                }

            }
        });



    }

}