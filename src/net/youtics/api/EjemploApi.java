package net.youtics.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class EjemploApi {

    public static void main(String[] args) {
        URL url;
        String key = "32ff831d1132458fa0835b4fdea6cb23";
        {
            try {
                url = new URL("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=32ff831d1132458fa0835b4fdea6cb23");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                //obtener codigo de respuesta
                int codigo = conn.getResponseCode();
                if(codigo==200)
                {
                    StringBuilder info = new StringBuilder();
                    Scanner scanner = Scanner(url.openStream());
                    while (scanner.hasNext())
                    {
                        info.append(scanner.nextLine());
                    }
                }
                System.out.println("codigo = " + codigo);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
