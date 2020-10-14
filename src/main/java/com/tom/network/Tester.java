package com.tom.network;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("http://atm201605.appspot.com/h");
            /*HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            InputStream is = httpURLConnection.getInputStream();*/
            InputStream in = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = br.readLine();
            while (line != null){
                sb.append(line);
                line = br.readLine();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }
}
