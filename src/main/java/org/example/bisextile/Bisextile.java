package org.example.bisextile;


import java.util.Scanner;
public class Bisextile {

            public static boolean estBissextile(int annee) {
            return (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;
        }
    }

