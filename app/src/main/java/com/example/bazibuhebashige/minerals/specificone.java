package com.example.bazibuhebashige.minerals;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.net.URL;

public class specificone extends AppCompatActivity {

    public static String actualdata;
    public static  String INIT_URL="https://www.quandl.com/api/v3/datasets/";
    public static   String pCode=null;
    public static String SPEC="SPEC";
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specificone);

        progressBar = findViewById(R.id.progressBar);


        Bundle intent = getIntent().getExtras();

        if (intent != null) {
            //if (intent.hasExtra(SPEC)) {
                actualdata = intent.getString(SPEC);
                pCode = products.dataCode(actualdata);
                String BASE_URL = INIT_URL+pCode+".json";

                try {
                    URL url = networkadapter.buildlUrl(BASE_URL);

                    new bookquery().execute(url);

                } catch (Exception e) {
                    Log.d("error", e.getMessage());
                }

            //}
        }
      /**  textview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String lien = "https://www.google.com/search?q=";
                Uri googlesearch = Uri.parse(lien + "stock price of " + actualdata);
                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                intent1.setData(googlesearch);

                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }

            }


        });**/
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

            progressBar.setVisibility(View.VISIBLE);

        }

        @Override
        protected void onPostExecute(String s) {
            TextView description = findViewById(R.id.description);
            TextView data = findViewById(R.id.data);
            TextView error = findViewById(R.id.textView);

            if(s==null)
                error.setVisibility(View.VISIBLE);
            else {
                progressBar.setVisibility(View.INVISIBLE);

                networkadapter.getDatafromJson(s);

                String descript = "Name: " + Commo.name + "\n\n" +
                        "Description: " + Commo.description + "\n\n" +
                        "Last refreshed on " + Commo.updatetime;
                String details = "Data from " + Commo.lastAvData + "\n" + "Price: " + Commo.data;


                description.setText(descript);
                data.setText(details);
            }


        }
    }
}
