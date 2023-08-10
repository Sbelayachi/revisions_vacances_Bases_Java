//          Exercice : Valeur maximale
//1. Ecrire un programme qui permet de trouver la valeur maximale dans un tableau
//      ==> tableau = [23, 150, 12, 28, 59, 2]
//      ==> La valeur maximale est 150 à l'indice 1

package org.example.baseTabeaux.exerciceValeurMaximale;

import java.util.Arrays;

public class ExerciceValeurMaximale {
    public static void main(String[] args) {

        int[] tableau = {23, 153, 258, 59987455, 236985};

        System.out.println(Arrays.toString(tableau));
        int max = 0;
        int cptMax = 0;

        for (int i = 0; i < tableau.length; i++) {

            if (i == 0) {
                max = tableau[i];

            }  if (tableau[i] > max) {
                max = tableau[i];
                cptMax = i;
            }
        }
        System.out.println("La valeur max est : " +max+ " à l'indice => " +cptMax);
    }}