package com.example.soniasunny.contact_sample;

import java.util.*;

public class ListItemComp{

   private List<ListItemComp> data = new ArrayList<>();
    private String name,no;
    int pic;

    public void setData(String name,String no,int pic){
        this.name=name;
        this.no=no;
        this.pic=pic;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return no;
    }
    public int getImage(){
        return pic;
    }

     public List getListData() {
        int[] images ={R.drawable.,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
        String[] number= new String[5];
        String [] names ={"Joe","Bob","Marley","Philip","Henry"};

        for (int j=0; j<5;j++){
            Double num = 1000000000*Math.random();
            number[j] = String.format("%.0f",num);
        }

        for (int count = 0; count < 5; count++) {
            ListItemComp item = new ListItemComp();
            setData( names[count],number[count],images[count]);
            data.add(item);
        }
        return data;
    }
}
