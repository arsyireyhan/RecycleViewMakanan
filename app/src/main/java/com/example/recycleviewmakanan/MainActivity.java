package com.example.recycleviewmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView makanan;

    String s1[], s2[];
    int images[] = {R.drawable.capcay,R.drawable.dimsum,R.drawable.fuyunghai,R.drawable.gyoza,R.drawable.ifumie,R.drawable.kwetiau,R.drawable.lumpia,R.drawable.miegoreng,R.drawable.nasigoreng,R.drawable.risoles};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makanan = findViewById(R.id.makanan);

        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);

        adaptermakanan adaptermakanan = new adaptermakanan(this, s1, s2, images);
        makanan.setAdapter(adaptermakanan);
        makanan.setLayoutManager(new LinearLayoutManager(this));
    }
}