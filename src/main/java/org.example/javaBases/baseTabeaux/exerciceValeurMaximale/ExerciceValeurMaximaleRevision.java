//1. Ecrire un programme qui permet de trouver la valeur maximale dans un tableau
//tableau = [23, 150, 12, 28, 59, 2]
//La valeur maximale est 150 à l'indice 1

package org.example.baseTabeaux.exerciceValeurMaximale;

import org.example.baseTabeaux.exerciceTableauxEgaux.TableauxEgauxMethode1;

public class ExerciceValeurMaximaleRevision {
    public static void main(String[] args) {

        int[] tableau = {23, 153, 258, 59987455, 236985};
        int max = 0;
        int cptMax = 0;

          //==== METHODE 1 ====

        for (int cpt = 0; cpt < tableau.length; cpt++) {
            if (cpt == 0) {
                tableau[cpt] = max;
            }
            if (tableau[cpt] > max) {
                max = tableau[cpt];
                cptMax=cpt  ;

            }
        }
        System.out.println("la valeur maximale du tableau est : " + max + " à l'indice : " + cptMax);

    }
}

////          ==== METHODE 1 ====todo voir pourquoi ça ne fonctionne pas ????
//
//
// for (int cpt = 0; cpt < tableau.length; cpt++)
//        {
//        if(tableau[cpt]>tableau[0])
//        {
//             max = tableau[cpt];
//                cptMax=cpt  ;
//
//            }
//        }
//        System.out.println("la valeur maximale du tableau est : " + max + " à l'indice : " + cptMax);
//
//    }
//}