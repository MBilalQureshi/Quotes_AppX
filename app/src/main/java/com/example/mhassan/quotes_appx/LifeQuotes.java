package com.example.mhassan.quotes_appx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;


public class LifeQuotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_quotes);

        ListView lst;
        final String[] quote ={"•\tDo not judge my story by the chapter you walked in on.\n –Unknown ",
                "•\tDifficult roads often lead to beautiful destinations.\n –Unknown" ,
                "•\tJust when I think I have learned the way to live,p life changes.\n –Hugh Prather" ,
                "•\tEmbrace the glorious mess that you are.\n –Elizabeth Gilbert" ,
                "•\tLife is like riding a bicycle. To keep your balance, you must keep moving. \n-Albert Einstein" ,
                "•\tLife is 10% what happens to you and 90% how you react to it.\n –Charles R.Swindoll" ,
                "•\tIf it comes; let it. If it goes; let it\n –Unknown ",
                "•\tIsn’t it funny how day by day nothing changes but when you look back everything is different.\n –C.S. Lewis"};
        final String[] quote1 ={"•\tDo not judge my ...","Difficult roads often...","Embrace the glorious...","Life is like riding...","Life is 10% what happens...","If it comes; let...","Isn’t it funny..."};
        lst = (ListView) findViewById(R.id.liflist);
        love_adapter loveAdapter = new love_adapter(this, quote1);
        lst.setAdapter(loveAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent mIntent = new Intent(LifeQuotes.this,Life_Detail.class);

                mIntent.putExtra("LIFE QUOTE",quote[i]);

                startActivity(mIntent);
            }
        });

    }
}
