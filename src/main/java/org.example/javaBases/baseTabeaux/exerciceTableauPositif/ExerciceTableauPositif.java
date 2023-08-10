//  ================== Exercice : Tableau positif  ============================
//      =======  SLIDE 95 ================
//1. Déclarer deux tableaux de 10 éléments
//2. Le premier tableau contiendra des nombres négatifs et positifs
//3. Ajouter tous les éléments positifs du premier tableau dans le second tableau



package org.example.baseTabeaux.exerciceTableauPositif;

import java.util.Arrays;

public class ExerciceTableauPositif {
    public static void main(String[] args) {


        /////// Methode 2 non finie


        int[] tableau1 = {0, -1, 2, 9, -9, 28, -15, 13, -17, 18};
        int[] tableau2 = new int[10];

        int cpt=0;

        for (int valeur:tableau1) {
            if (valeur > 0) {
                tableau2[cpt] = valeur;
                cpt++;
            }
        }
            System.out.println(Arrays.toString(tableau2));
        }}



                /////// Methode 2 non finie todo A FINIR ++++++++
   // Voir Révision exo refait avec une boucle for

//                int[] tableau1 = {0, -1, 2, 9, -9, 28, -15, 13, -17, 18};
//        }
//        int[] tableau2 = new int[10];

//        System.out.println(Arrays.toString(tableau1));
//        System.out.println(Arrays.toString(tableau2));
//            tableau1[i] = i;


//        for (int i = 0; i < tableau1.length; i++) {
////        System.out.println(tableau1[i]);
//
//            for (int j = 0; j < tableau2.length; j++) {
////            System.out.println(tableau2[j]);
//
//
//                if (tableau1[i] > 0) {
//                    tableau2[j] = tableau1[i];
//                }
//                System.out.println(tableau2[j]);
////            System.out.println(Arrays.toString(tableau2));
//
//            }}
//    }
//}


//            for (int j = 0; j < tableau2.length; j++) {
//                if (i<0)
//                {tableau2[j] = i;
//
//            System.out.println(Arrays.toString(tableau2));
//                }



