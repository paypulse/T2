package com.example.t2_step1.Common;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {

    public static void InitData(String realUrl, String serviceKey, String mobileOs, String mobileApp ){

        URL url = null;
        HttpURLConnection urlConnection= null;

        int connTimeout = 5000;
        int readTimeout = 9000;
        int responseCode = 0;

        String urlT = realUrl +"?MobileOS="+mobileOs+"&MobileApp="+mobileApp+"&serviceKey="+serviceKey;


        try {


            url = new URL(urlT );


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



            }

        }catch (Exception e){
            e.printStackTrace();
        }




    }


    /**
     * xml to json
     * */
    public void xmlToJson(){

    }



}
