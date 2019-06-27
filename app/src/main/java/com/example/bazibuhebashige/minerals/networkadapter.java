package com.example.bazibuhebashige.minerals;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class networkadapter {
 public networkadapter(){}


    public static  final String KEY = "api_key";
    public static  final String QUERY_KEY = "q" ;
    public static  final String KEY_API = "5Mqx8cJ2ni3zxMQYEEem";

    public static URL buildlUrl(String BASE_URL) {

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
    public static void getDatafromJson(String json){
        String detail="dataset";
        String name="name";
        String description="description";
        String updatetime="refreshed_at";
        String lastAvData="newest_available_date";
        String id="id";
        String data="data";


        try {
            JSONObject alldata = new JSONObject(json);
            JSONObject Mydata = alldata.getJSONObject(detail);
            JSONArray detailArray = Mydata.getJSONArray(data);
            String[] col = new String[7];

            for(int i=0;i<5;i++){
                if(i==0){
                    for(int j=0;j<=1;j++){
                        if(j==0){
                            col[j] = detailArray.getJSONArray(j).toString();
                        }
                    }
                }
            }
            new Commo(Mydata.getString(id),col,
                    Mydata.getString(name),Mydata.getString(description),
                    Mydata.getString(updatetime),Mydata.getString(lastAvData));



        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
