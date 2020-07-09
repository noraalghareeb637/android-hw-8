package com.example.gg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> mypokemon=new ArrayList<>();

        pokemon p1 = new pokemon(  "Ivysaur" ,R.drawable.iii, 62,40,405);
        pokemon p2 = new pokemon(  "charmeleon" ,R.drawable.charmeleon,64,33,405);
        pokemon p3 = new pokemon(  "Clefairy",R.drawable.clefairy,70,55,323);
        pokemon p4 = new pokemon(  "Clefable" ,R.drawable.clefable,64,38,438);

        mypokemon.add(p1);
        mypokemon.add(p2);
        mypokemon.add(p3);
        mypokemon.add(p4);

        RecyclerView rv = findViewById(R.id.RecyclerView);


        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager In =new LinearLayoutManager(this);
        rv.setLayoutManager(In);




        pokemonAdapter adpter = new pokemonAdapter(mypokemon,this);
        rv.setAdapter(adpter);



    }
}