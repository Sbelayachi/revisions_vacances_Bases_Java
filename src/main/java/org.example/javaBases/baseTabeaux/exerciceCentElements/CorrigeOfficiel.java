package org.example.baseTabeaux.exerciceCentElements;

public class CorrigeOfficiel {
    public static void main(String[] args) {


        int[] tableau = new int[100];

        for (int cpt = 0; cpt < 100; cpt++) {
            tableau[cpt] = cpt;
        }

        for (int cpt1 = 0; cpt1 < tableau.length; cpt1++) {

            if( cpt1 % 10 == 9) {
                System.out.print(tableau[cpt1] + "\n");
            } else {
                System.out.print(tableau[cpt1] + ", ");
            }

        }

    }
}