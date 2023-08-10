// =============SLIDE 97 ===============
//Exercice : Tableaux égaux
//1. Ecrire un programme qui permet de vérifier si 2 tableaux sont égaux
//2. Vérifier la taille des tableaux et l'ordre des valeurs

//tableau1 = [1, 4, 2, 3]
//tableau2 = [1, 4, 2, 3]


package org.example.javaBases.baseTabeaux.exerciceTableauxEgaux;

import java.util.Arrays;

public class ExerciceTableauxEgauxRevision {
    public static void main(String[] args) {

        int[] tabelau1 = {1, 4, 2, 4};
        int[] tabelau2 = {1, 4, 2, 3};

        boolean isEqual=true;


        if (tabelau1.length == tabelau2.length)

        {
            for (int cpt1 = 0; cpt1 < tabelau1.length; cpt1++)
            {
                if (tabelau1[cpt1] != tabelau2[cpt1])
                {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("Les tableaux sont égaux");
        } else {
            System.out.println("Les tableaux ne sont pas égaux");
        }
    }
}