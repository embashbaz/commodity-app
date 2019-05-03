package com.example.bazibuhebashige.minerals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.bazibuhebashige.minerals.comodities_adapter.adaptateronclickhandler;

import static com.example.bazibuhebashige.minerals.products.*;


public class MainActivity extends AppCompatActivity implements adaptateronclickhandler {

    comodities_adapter comodities;
    RecyclerView myapp;
    private static int size = allofthem.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myapp = findViewById(R.id.my_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        myapp.setLayoutManager(layoutManager);

        myapp.setHasFixedSize(true);

        comodities = new comodities_adapter(this);

        myapp.setAdapter(comodities);

    }
    @Override
         public void onClick(String specmin) {

        Intent intent = new Intent(this, specificone.class);
        intent.putExtra(Intent.EXTRA_TEXT, specmin);
        startActivity(intent);
    }

}
