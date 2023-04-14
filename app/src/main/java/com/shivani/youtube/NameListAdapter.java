package com.shivani.youtube;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NameListAdapter extends BaseAdapter {

    int thumbnails[];
    String name[],text[],discription[];
    public NameListAdapter(int[] thumbnail, String[] name, String[] text, String[] discription) {
        this.thumbnails = thumbnail;
        this.name =name;
        this.text = text;
        this.discription = discription;
    }

    @Override
    public int getCount() {
        return thumbnails.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spin_img,viewGroup,false);
        ImageView imgphoto = view.findViewById(R.id.imgphoto);
        TextView txtname =view.findViewById(R.id.txtname);
        TextView txttext = view.findViewById(R.id.txttext);
        TextView txtdesc = view.findViewById(R.id.txtdesc);
        Glide.with(viewGroup.getContext()).load(thumbnails[i]).into(imgphoto);
        txtname.setText(name[i]);
        txttext.setText(text[i]);
        txtdesc.setText(discription[i]);
        return view;


    }
}
