package com.example.gg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
      pokemon p = (pokemon) b.getSerializable("pokemon1");

        TextView name = findViewById(R.id.textView3);
        TextView attack = findViewById(R.id.textView4);
        TextView defence = findViewById(R.id.textView5);
        TextView total = findViewById(R.id.textView6);
        ImageView img = findViewById(R.id.imageView);

        name.setText(p.getName());
        attack.setText(p.getAttack()+"");
        defence.setText(p.getDefence()+"");
        total.setText(p.getTotal()+"");
        img.setImageResource(p.getImage());
    }
}