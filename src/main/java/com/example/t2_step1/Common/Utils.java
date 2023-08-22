package com.example.t2_step1.Common;

import com.google.gson.JsonArray;
import io.swagger.v3.core.util.Json;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.net.HttpURLConnection;

import java.net.URL;

public class Utils {

    public static void InitData(String realUrl, String serviceKey, String mobileOs, String mobileApp ){

        URL url = null;
        HttpURLConnection urlConnection= null;

        int connTimeout = 500000000;
        int readTimeout = 100000000;
        int responseCode = 0;

        String urlT = realUrl +"?MobileOS="+mobileOs+"&MobileApp="+mobileApp+"&serviceKey="+serviceKey;


        try {


            url = new URL(urlT);


            System.out.println(url);

            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(connTimeout);
            urlConnection.setReadTimeout(readTimeout);

            urlConnection.setRequestProperty("Accept", "application/json;");

            responseCode = urlConnection.getResponseCode();

            if(responseCode == 200){
                StringBuilder sb = new StringBuilder();
                String line = "";
                InputStreamReader ir = new InputStreamReader(urlConnection.getInputStream());
                BufferedReader br = new BufferedReader(ir);
                while( (line = br.readLine()) != null) {
                    sb.append(line);
                }


                xmlToJson(sb);



            }

        }catch (Exception e){
            e.printStackTrace();
        }




    }


    /**
     * xml to json
     * */
    public static void xmlToJson(StringBuilder sb){
        JSONObject xmlJSONObject = XML.toJSONObject(sb.toString());
        //String item = xmlJSONObject.getString("response");
        JSONObject response =xmlJSONObject.getJSONObject("response");
        JSONObject bodyStr = response.getJSONObject("body");
        JSONObject items = bodyStr.getJSONObject("items");
        JSONArray item = items.getJSONArray("item");


        System.out.println(item);





    }



}
