package com.moringaschool.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Huey Freeman", "huey@boondocks.inc",R.drawable.img));
        items.add(new Item("Riley Freeman", "Riley@boondocks.inc",R.drawable.img));
        items.add(new Item("Callum Prince", "callum@dragonprince.inc",R.drawable.img));
        items.add(new Item("Ezran Prince", "huey@boondocks.inc",R.drawable.img));
        items.add(new Item("Rayla", "huey@boondocks.inc",R.drawable.img));
        items.add(new Item("Milly", "milly@umizumi.inc",R.drawable.img));
        items.add(new Item("Akili", "akili@akilikids.inc",R.drawable.img));
        items.add(new Item("happyhippo", "happyhipp@akilikids.inc",R.drawable.img));
        items.add(new Item("Nick", "nick@flashsquad.inc",R.drawable.img));
        items.add(new Item("Messi", "messi@okido.inc",R.drawable.img));
        items.add(new Item("Felix", "felix@okido.inc",R.drawable.img));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}