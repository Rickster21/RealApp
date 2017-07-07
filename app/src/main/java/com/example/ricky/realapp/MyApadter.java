package com.example.ricky.realapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ricky on 6/26/2017.
 */

public class MyApadter extends ArrayAdapter<String> {
    String[] names;
    int[] spiderPics;
    Context mcontext;

    public MyApadter(Context context, String[] names, int[] speciesPics) {
        super(context, R.layout.custom_layout);

        this.names = names;
        this.spiderPics = speciesPics;
        this.mcontext = context;


    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater minflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = minflater.inflate(R.layout.custom_layout, parent, false);
            mViewHolder.mspeciesPic = (ImageView) convertView.findViewById(R.id.imageview);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textview);
            convertView.setTag(mViewHolder);
        } else {
                  mViewHolder = (ViewHolder)convertView.getTag();
        }
           mViewHolder.mspeciesPic.setImageResource(spiderPics[position]);
           mViewHolder.mName.setText(names[position]);

        return convertView;
    }





    static class ViewHolder {

        ImageView mspeciesPic;
        TextView mName;


    }

}

