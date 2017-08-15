package com.example.mhassan.quotes_appx;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by M.Hassan on 8/14/2017.
 */

public class LifeAdapter  extends ArrayAdapter<String> {

    private String[] life;
    private Activity context;
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {

            LayoutInflater layoutInflator = context.getLayoutInflater();
            r = layoutInflator.inflate(R.layout.life_quote_1, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (LifeAdapter.ViewHolder) r.getTag();
        }
        viewHolder.txt1.setText(life[position]);

        // return super.getView(position, convertView, parent);
        return r;
    }

    public LifeAdapter(Activity context, String[] love) {
        super(context, R.layout.life_quote_1, love);

        this.context = context;
        this.life = love;

    }

    class ViewHolder {
        TextView txt1;
        ViewHolder(View v) {
            txt1 = (TextView) v.findViewById(R.id.IdLife);

        }
    }
}
