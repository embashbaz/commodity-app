package com.example.bazibuhebashige.minerals;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.net.URL;

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
                try {
                    URL url = networkadapter.buildlUrl();

                    new bookquery().execute(url);

                } catch (Exception e) {
                    Log.d("error", e.getMessage());
                }
                textview.setText(actualdata);
            }
        }
        textview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String lien = "https://www.google.com/search?q=";
                Uri googlesearch = Uri.parse(lien + "stock price of " + actualdata);
                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                intent1.setData(googlesearch);

                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }

            }


        });
    }

    public class bookquery extends AsyncTask<URL, Void, String> {

        @Override
        protected String doInBackground(URL... urls) {
            URL searchurl = urls[0];
            String result = null;

            try {
                result = networkadapter.getjason(searchurl);
            } catch (Exception e) {
                Log.e("error", e.getMessage());
            }
            return result;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected void onPostExecute(String s) {
            TextView textView = findViewById(R.id.textview);

            textView.setText(s);


        }
    }
}
