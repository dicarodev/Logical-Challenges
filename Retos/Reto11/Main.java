package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * Dada una URL con parámetros, crea una función que obtenga sus valores.
         * No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
         *
         * Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
         * los parámetros serían ["2023", "0"]
         */

        String url = "ttps://retosdeprogramacion.com#year=2023&challenge=0&twitch=dicarodev";

        List<String> urlParameters = getParameters(url);

        System.out.println(urlParameters);

    }

    public static List<String> getParameters (String url) {
        ArrayList<String> urlParameters = new ArrayList<>();

        int indexParameters = url.indexOf("?");
        String parameters = url.substring(indexParameters+1);

        String[] arrayParameters = parameters.split("&");

        for (String arrayParameter : arrayParameters) {
            urlParameters.add(arrayParameter.split("=")[1]);
        }

        return urlParameters;
    }
}