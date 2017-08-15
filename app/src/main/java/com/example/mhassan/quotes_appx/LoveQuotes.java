package com.example.mhassan.quotes_appx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;


public class LoveQuotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_quotes);

        ListView lst;
        final String[] quote ={"•\tOne love, one heart one destiny. –Bob Marley",
                "•\tLove yourself. It is important to stay positive because beauty comes from the inside out. –Jenn Proske",
                "•\tI smile like an idiot when I think about you.\n –Unknown",
                "•\tToday and always, beyond tomorrow, I need you beside me, always as my best friend, lover and forever soul mate.\n –Unknown",
                "•\tI just wanna hold you tight in my arms and whisper in your ear ‘I love you’.\n -Unknown" ,
                "•\tWhen I saw you I fell in love, and you smiled because you knew.\n –William Shakespeare" ,
                "•\tNever love anybody who treats you like you’re ordinary.\n –Oscar Wilde"};
        final String[] quote1 ={"•\tOne love, one heart...", "•\tLove yourself. It is...","•\tI smile like an idiot ... ",
                "•\tToday and always ... ",
                "•\tI just wanna hold you... ",
                "•\tWhen I saw you I fell in love ...",
                "•\tNever love anybody ..."};
        lst = (ListView) findViewById(R.id.luvlist);
        love_adapter loveAdapter = new love_adapter(this, quote1);
        lst.setAdapter(loveAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent mIntent = new Intent(LoveQuotes.this,LoveDetail.class);

                mIntent.putExtra("LOVE QUOTE",quote[i]);

                startActivity(mIntent);
            }
        });

    }
}
