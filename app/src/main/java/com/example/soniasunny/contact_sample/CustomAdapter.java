package com.example.soniasunny.contact_sample;

import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter{
    ListItemComp itemClass = new ListItemComp();
    MainActivity main = new MainActivity();
    List<ListItemComp> data = new ArrayList<>();

    @Override
    //tells listView the number of rows required to hold all data items(basically the no of items in the list)
    public int getCount() {
      return data.size();
    }
    //returns the element at the index passed(starting at 0)
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }
    //.used by listView to map data to rows
    @Override
    public long getItemId(int position) {
        return position;
    }
    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       data = itemClass.getListData();
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) main.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.items,parent,false);
        }
        TextView name = (TextView)convertView.findViewById(R.id.contact_name);
        TextView number = (TextView)convertView.findViewById(R.id.contact_number);
        ImageView image = (ImageView)convertView.findViewById(R.id.contact_image);

        ListItemComp contact = data.get(position);

        name.setText(contact.getName());
        number.setText(contact.getNumber());
        image.setImageResource(contact.getImage());

        return convertView;
    }
}
