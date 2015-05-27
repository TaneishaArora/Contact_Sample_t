package com.example.soniasunny.contact_sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import  java.util.Random;
import java.util.AbstractList;
import java.util.List;

public class MainActivity extends Activity{

    CustomAdapter adapter = new CustomAdapter();
    ListView contactList = (ListView) findViewById(R.id.list_Main);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList.setAdapter(adapter);
        }

    }

