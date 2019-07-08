package com.example.bazibuhebashige.minerals;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bazibuhebashige.minerals.comodities_adapter.adaptateronclickhandler;

import static com.example.bazibuhebashige.minerals.products.*;


public class MainActivity extends AppCompatActivity implements adaptateronclickhandler {

    comodities_adapter comodities;
    RecyclerView myapp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myapp = findViewById(R.id.my_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        myapp.setLayoutManager(layoutManager);

        //myapp.setHasFixedSize(true);

        comodities = new comodities_adapter(this);
        myapp.setAdapter(comodities);

    }
    @Override
         public void onClick(String specmin) {

        Intent intent = new Intent(this, specificone.class);
        intent.putExtra(specificone.SPEC, specmin);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.search, menu);
        final MenuItem searchitem = menu.findItem(R.id.action_search);
        final SearchView searchView =(SearchView) searchitem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                comodities.getFilter().filter(s);


                return true;
            }
        });

        return true;
    }
}
