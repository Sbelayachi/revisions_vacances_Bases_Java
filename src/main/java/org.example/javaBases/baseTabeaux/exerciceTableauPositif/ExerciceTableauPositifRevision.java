////  ================== Exercice : Tableau positif  ============================
////      =======  SLIDE 95 ================
////1. Déclarer deux tableaux de 10 éléments
////2. Le premier tableau contiendra des nombres négatifs et positifs
////3. Ajouter tous les éléments positifs du premier tableau dans le second tableau


//======== révision boucle for

package org.example.javaBases.baseTabeaux.exerciceTableauPositif;

import java.util.Arrays;

public class ExerciceTableauPositifRevision {

    public static void main(String[] args) {

        int[] tableau1 = {1, -1, 9, -6, -3, 9, 9, 10, 12, -6};
        int[] tableau2 = new int[10];


        for (int cpt1 = 0; cpt1 < tableau1.length; cpt1++)
        {
            if (tableau1[cpt1]>0)
              {
            tableau2[cpt1]=tableau1[cpt1];
             }
        }
        System.out.println(Arrays.toString(tableau2));
    }
}