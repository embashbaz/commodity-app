package com.example.bazibuhebashige.minerals;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class specificone extends AppCompatActivity {

    String actualdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specificone);

        Intent intent = getIntent();

        TextView textview = findViewById(R.id.textview);

        if (intent != null) {
            if (intent.hasExtra(Intent.EXTRA_TEXT)) {
                actualdata = intent.getStringExtra(Intent.EXTRA_TEXT);

                textview.setText(actualdata);
            }
        }
        textview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String lien = "https://www.google.com/search?q=";
                Uri googlesearch = Uri.parse(lien + "stock price of " + actualdata);
                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                intent1.setData(googlesearch);

                if(intent1.resolveActivity(getPackageManager())!= null){
                    startActivity(intent1);
                }

                            }


        });
    }

}
