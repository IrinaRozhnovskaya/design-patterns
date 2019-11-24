package com.javarush.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (Exception e) {
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            reader.close();
            if (s.equals("earth")) {
                 thePlanet = Earth.getInstance();
            } else if (s.equals("sun")) {
                thePlanet = Sun.getInstance();
            } else if (s.equals("moon")) {
                thePlanet = Moon.getInstance();
            } else thePlanet = null;

        } catch (IOException e) {
        }
    }
}