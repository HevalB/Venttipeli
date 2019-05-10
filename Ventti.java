/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oliot;

import java.util.Scanner;

/**
 *
 * @author s1900447
 */
public class Ventti {

    public static void main(String[] args) {

        double randomDouble = Math.random();
        randomDouble = randomDouble * 13 + 2;
        int kortti = (int) randomDouble;

        double randomDouble2 = Math.random();
        randomDouble2 = randomDouble2 * 13 + 2;
        int kortti2 = (int) randomDouble2;

        double randomDouble3 = Math.random();
        randomDouble3 = randomDouble3 * 13 + 2;
        int kortti3 = (int) randomDouble3;

        double randomDouble4 = Math.random();
        randomDouble4 = randomDouble4 * 13 + 2;
        int kortti4 = (int) randomDouble4;

        double randomDouble5 = Math.random();
        randomDouble5 = randomDouble5 * 13 + 2;
        int kortti5 = (int) randomDouble5;

        Scanner lukija = new Scanner(System.in);
        //jaa kortit
        if ((kortti + kortti2) < 21) {
            System.out.println(kortti + " | " + kortti2 + "\nHaluatko jatkaa? (k/e)");
            String jatka = lukija.nextLine();
            if (jatka.equals("k") && (kortti + kortti2 + kortti3) < 21) {
                System.out.println(kortti + " | " + kortti2 + " | " + kortti3 + "\nHaluatko jatkaa? (k/e)");
                String jatka2 = lukija.nextLine();
                if (jatka2.equals("k") && (kortti + kortti2 + kortti3 + kortti4) < 21) {
                    System.out.println(kortti + " | " + kortti2 + " | " + kortti3 + " | " + kortti4+ "\nHaluatko jatkaa? (k/e)");
                    String jatka3 = lukija.nextLine();
                    if (jatka3.equals("k") && (kortti+kortti2+kortti3+kortti4+kortti5)<=21) {
                    System.out.println(kortti + " | " + kortti2 + " | " + kortti3 + " | " + kortti4 + " | "+kortti5+ "\nVoitit!");    
                    }
                    //mitä tapahtuu, kun 
                } else if (jatka2.equals("e") || (kortti + kortti2 + kortti3 + kortti4) > 21) {
                    System.out.println(kortti + " | " + kortti2 + " | " + kortti3);
                    System.out.println("Hävisit!");
                }
            } else if (jatka.equals("e") || (kortti + kortti2 + kortti3) > 21) {
                System.out.println(kortti + " | " + kortti2 + " | " + kortti3);
                System.out.println("Hävisit!");
            }
        } else if ((kortti + kortti2) > 21) {
            System.out.println(kortti + " | " + kortti2);
            System.out.println("Hävisit!");
        }

    }
}
