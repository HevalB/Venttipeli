/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oliot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author s1900447
 */
public class Ventti {

    public static void main(String[] args) {

        int[] kortit = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Random r = new Random();
        int pelaajaKortti = r.nextInt(kortit.length);
        int pelaajaKortti2 = r.nextInt(kortit.length);
        int pelaajaKortti3 = r.nextInt(kortit.length);
        int pelaajaKortti4 = r.nextInt(kortit.length);
        int pelaajaKortti5 = r.nextInt(kortit.length);

        int emantaKortti = r.nextInt(kortit.length);
        int emantaKortti2 = r.nextInt(kortit.length);
        int emantaKortti3 = r.nextInt(kortit.length);
        int emantaKortti4 = r.nextInt(kortit.length);
        

        Scanner lukija = new Scanner(System.in);
        String jatka;
        
        if ((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) < 21) {
            System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + "\nHaluatko jatkaa? (k/e)");
            System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
            jatka = lukija.nextLine();

            if ((jatka.equals("e")) && ((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) > (kortit[emantaKortti] + kortit[emantaKortti2]) && (kortit[pelaajaKortti] + kortit[pelaajaKortti2]) < 21)) {
                System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
                System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2]));
                System.out.println("Voitit!");
            } else if ((jatka.equals("e")) && ((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) <= (kortit[emantaKortti] + kortit[emantaKortti2]) && (kortit[emantaKortti] + kortit[emantaKortti2]) < 21)) {
                System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
                System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2]));
                System.out.println("Hävisit!");
            }
            
            if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) < 21) {
                System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + "\nHaluatko jatkaa? (k/e)");
                System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]));
                jatka = lukija.nextLine();

                if ((jatka.equals("e")) && ((kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) > (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3]) && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) < 21)) {
                    System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]));
                    System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " | " + kortit[emantaKortti3] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3]));
                    System.out.println("Voitit!");
                } else if ((jatka.equals("e")) && ((kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) <= (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3]) && (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3]) < 21)) {
                    System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]));
                    System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " | " + kortit[emantaKortti3] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3]));
                    System.out.println("Hävisit!");
                }
                
                if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) < 21) {
                    System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + "\nHaluatko jatkaa? (k/e)");
                    System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]));
                    jatka = lukija.nextLine();

                    if ((jatka.equals("e")) && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) > (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3] + kortit[emantaKortti4]) && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) < 21) {
                        System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]));
                        System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " | " + kortit[emantaKortti3] + " | " + kortit[emantaKortti4] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3] + kortit[emantaKortti4]));
                        System.out.println("Voitit!");
                    } else if ((jatka.equals("e")) && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) <= (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3] + kortit[emantaKortti4]) && (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3] + kortit[emantaKortti4]) < 21) {
                        System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]));
                        System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " | " + kortit[emantaKortti3] + " | " + kortit[emantaKortti4] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2] + kortit[emantaKortti3] + kortit[emantaKortti4]));
                        System.out.println("Hävisit!");
                    }
                    
                    if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4] + kortit[pelaajaKortti5]) < 21) {
                        System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + " | " + kortit[pelaajaKortti5] + "\nVoitit!");
                    } else if ((kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4] + kortit[pelaajaKortti5]) > 21) {
                        System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + " | " + kortit[pelaajaKortti5]);
                        System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4] + kortit[pelaajaKortti5]));
                        System.out.println("Hävisit!");
                    } else if ((kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4] + kortit[pelaajaKortti5]) == 21) {
                        System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4] + " | " + kortit[pelaajaKortti5]);
                        System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4] + kortit[pelaajaKortti5]));
                        System.out.println("Voitit!");
                    }
                    
                } else if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) > 21) {
                    System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4]);
                    System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]));
                    System.out.println("Hävisit!");
                } else if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]) == 21) {
                    System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3] + " | " + kortit[pelaajaKortti4]);
                    System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3] + kortit[pelaajaKortti4]));
                    System.out.println("Voitit!");
                }
                
            } else if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) > 21) {
                System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3]);
                System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]));
                System.out.println("Hävisit!");
            } else if (jatka.equals("k") && (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]) > 21) {
                System.out.println(kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " | " + kortit[pelaajaKortti3]);
                System.out.println("Summa: " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2] + kortit[pelaajaKortti3]));
                System.out.println("Voitit!");
            }
            
        } else if ((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) > 21) {
            System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
            System.out.println("Hävisit!");
        } else if (((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) == 21) && ((kortit[emantaKortti] + kortit[emantaKortti2]) != 21)) {
            System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
            System.out.println("Voitit!");
        } else if (((kortit[emantaKortti] + kortit[emantaKortti2]) == 21) && ((kortit[pelaajaKortti] + kortit[pelaajaKortti2]) == 21)) {
            System.out.println("Pelaajan käsi: " + kortit[pelaajaKortti] + " | " + kortit[pelaajaKortti2] + " = " + (kortit[pelaajaKortti] + kortit[pelaajaKortti2]));
            System.out.println("Emännän käsi: " + kortit[emantaKortti] + " | " + kortit[emantaKortti2] + " = " + (kortit[emantaKortti] + kortit[emantaKortti2]));
            System.out.println("Hävisit!");
        }

    }

}
