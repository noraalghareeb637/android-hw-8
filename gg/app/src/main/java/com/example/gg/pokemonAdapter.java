package com.example.gg;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonAdapter extends RecyclerView.Adapter {
   ArrayList<pokemon> parray ;

     Context context;

    public pokemonAdapter(ArrayList<pokemon> parray, Context context) {
        this.parray = parray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_items,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(parray.get(position).getImage());
        ((ViewHolder) holder).pokemonname.setText(parray.get(position).getName());
        ((ViewHolder) holder).pokemontotal.setText(parray.get(position).getTotal()+"");
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,MainActivity2.class);
                i.putExtra("pokemon1",parray.get(position));
                context.startActivity(i);

            }
        });




    }

    @Override
    public int getItemCount() {
        return parray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img     ;
        public TextView pokemonname;
        public TextView pokemontotal ;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view=itemView;
            pokemonname=itemView.findViewById(R.id.textView);
            pokemontotal=itemView.findViewById(R.id.textView2);
            img=itemView.findViewById(R.id.imageView2);
        }
    }
}
