// =============SLIDE 97 ===============
//Exercice : Tableaux égaux
//1. Ecrire un programme qui permet de vérifier si 2 tableaux sont égaux
//2. Vérifier la taille des tableaux et l'ordre des valeurs



// Essai 1 : LONG ++++ Avec comparasion de 4 tableaux
package org.example.javaBases.baseTabeaux.exerciceTableauxEgaux;

import java.util.Arrays;

public class TableauxEgauxMethode1 {
    public static void main(String[] args) {


        int[] tableau1 = {1, 2, 3, 4};
        int[] tableau2 = {1, 2, 3, 4};
        int[] tableau3 = {1, 2, 4, 3};
        int[] tableau4 = {1, 2, 3,};

        System.out.println("==>Longueur du tableau 1 : " + tableau1.length);
        System.out.println("==>Longueur du tableau 2 : " + tableau2.length);
        System.out.println("==>Longueur du tableau 3 : " + tableau3.length);
        System.out.println("==>Longueur du tableau 4 : " + tableau4.length);



        int indice1 = 0, indice2 = 0, indice3 = 0, indice4 = 0;


        if (tableau1[indice1] == tableau2[indice2] && indice1 == indice2) {
            indice1++;
            indice2++;
            System.out.println("\n== Tableau 1 ==\n"  + Arrays.toString(tableau1));
            System.out.println("== Tableau 2 ==\n" + Arrays.toString(tableau2));
            System.out.println("============  Les tableaux 1 et 2 sont EGAUX  ============");
            System.out.println("              -------------------------------");

        }
        else {
            System.out.println("\n== Tableau 1 ==\n"  + Arrays.toString(tableau1));
            System.out.println("== Tableau 2 ==\n" + Arrays.toString(tableau2));
            System.out.println("============  Les tableaux 1 et 2 sont DIFFERENTS  ============");
            System.out.println("              -----------------------------------");
        }

        if (tableau1[indice1] == tableau3[indice3] && tableau1.length == tableau3.length) {
            indice1++;
            indice3++;
            System.out.println("\n== Tableau 1 ==\n"  + Arrays.toString(tableau1));
            System.out.println("== Tableau 3 ==\n" + Arrays.toString(tableau3));
            System.out.println("============  Les tableaux 1 et 3 sont EGAUX  ============");
            System.out.println("              -------------------------------");
        }
        else {
            System.out.println("\n== Tableau 1 ==\n" + Arrays.toString(tableau1));
            System.out.println("== Tableau 3 ==\n" + Arrays.toString(tableau3));
            System.out.println("============ Les tableaux 1 et 3 sont DIFFERENTS ============");
        }

        if ((tableau1[indice1] == tableau4[indice4]) && tableau1.length == tableau4.length) {
            indice1++;
            indice4++;
            System.out.println("\n== Tableau 1 ==\n"  + Arrays.toString(tableau1));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============  Les tableaux 1 et 4 sont EGAUX  ============");
            System.out.println("              -------------------------------");
        }
        else {
            System.out.println("\n== Tableau 1 ==\n" + Arrays.toString(tableau1));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============ Les tableaux 1 et 4 sont DIFFERENTS ============");
            System.out.println("              -------------------------------");

        }

        //tableau 2 comparé aux autres trableaux


        if (tableau2[indice2] == tableau3[indice3] && tableau2.length == tableau3.length) {
            indice2++;
            indice3++;
            System.out.println("\n== Tableau 2 ==\n"  + Arrays.toString(tableau2));
            System.out.println("== Tableau 3 ==\n" + Arrays.toString(tableau3));
            System.out.println("============  Les tableaux 2 et 3 sont EGAUX  ============");
            System.out.println("              -------------------------------");

        }
        else {
            System.out.println("\n== Tableau 2 ==\n"  + Arrays.toString(tableau2));
            System.out.println("== Tableau 3 ==\n" + Arrays.toString(tableau3));
            System.out.println("============  Les tableaux 2 et 3 sont DIFFERENTS  ============");
            System.out.println("              -----------------------------------");
        }

        if (tableau2[indice2] == tableau4[indice4] && tableau2.length == tableau4.length) {
            indice2++;
            indice4++;
            System.out.println("\n== Tableau 2 ==\n"  + Arrays.toString(tableau2));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============  Les tableaux 2 et 4 sont EGAUX  ============");
            System.out.println("              -------------------------------");

        }
        else {
            System.out.println("\n== Tableau 2 ==\n"  + Arrays.toString(tableau2));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============  Les tableaux 2 et 4 sont DIFFERENTS  ============");
            System.out.println("              -----------------------------------");
        }

        //tableau 3 : à comparer au tableau 4 ==> déja comparé aux tableau 1  2)

        if (tableau3[indice3]==tableau4[indice4] && tableau3.length==tableau4.length)
        {
indice4++;
indice3++;
System.out.println("\n== Tableau 3 ==\n"  + Arrays.toString(tableau3));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============  Les tableaux 3 et 4 sont EGAUX  ============");
            System.out.println("              -------------------------------");

              }
        else {
            System.out.println("\n== Tableau 3 ==\n"  + Arrays.toString(tableau3));
            System.out.println("== Tableau 4 ==\n" + Arrays.toString(tableau4));
            System.out.println("============  Les tableaux 3 et 4 sont DIFFERENTS  ============");
            System.out.println("              -----------------------------------");
                }
        //tableau 4 : ==> déja comparé aux tableau 1, 2 et 3)


    }

}