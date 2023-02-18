package net.youtics.api;
import org.json.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiOtraForma {
    public static void main(String[] args) {
        String key = "32ff831d1132458fa0835b4fdea6cb23";
        {
            try {
                URL url = new URL("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey="+key);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                InputStream strm = conn.getInputStream();
                byte [] arrStream = strm.readAllBytes();
                String cnJson="";

                for (byte tmp: arrStream) {
                    cnJson+=(char)tmp;
                }
                JSONObject json = new JSONObject(cnJson);
                JSONArray arrJson = json.getJSONArray("articles");
                System.out.println("arrJson = " + arrJson);
                for (Object obj: arrJson) {
                    System.out.println( ("AUTOR: " + ((JSONObject)obj).get("author")));
                    System.out.println( ("DESCRIPCIÓN: " + ((JSONObject)obj).get("description") ));
                    System.out.println("------------------------------");
                }
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
