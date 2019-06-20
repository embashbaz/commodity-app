package com.example.bazibuhebashige.minerals;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class networkadapter {
 public networkadapter(){}

    public static final String BASE_URL="https://www.quandl.com/api/v3/datasets/MWCS.json";
    public static  final String KEY = "api_key";
    public static  final String QUERY_KEY = "q" ;
    public static  final String KEY_API = "5Mqx8cJ2ni3zxMQYEEem";

    public static URL buildlUrl() {

        URL url = null;
        Uri uri = Uri.parse(BASE_URL).buildUpon()
                //.appendQueryParameter(QUERY_KEY,"cooking")
                .appendQueryParameter(KEY, KEY_API)
                .build();

        try {
            url = new URL(uri.toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String getjason(URL url)throws IOException {


        HttpURLConnection connect =(HttpURLConnection) url.openConnection();
        connect.setDoOutput(false);
        try {
            InputStream stream = connect.getInputStream();
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\A");

            boolean hasedata = scanner.hasNext();
            if (hasedata) {
                return scanner.next();
            } else {
                return null;
            }
        }catch (Exception e){
            Log.d("error", e.toString());
            return null;
        }
        finally {
            connect.disconnect();
        }

    }

}
