//   ===========Exercice : Tables de multiplications ============
//   =========== SLIDE 80 ===================

//1. Créer un programme permettant d'afficher les tables de multiplications de 1 à 10

package org.example.baseBoucles;

public class ExerciceTablesMultiplication {
    public static void main(String[] args) {
        System.out.println("============= TABLES DE MULTIPLICATION  de 1 à 10 =============");


        for (int i = 0; i <= 10; i++) {
            System.out.println("\n ========= TABLE DE "+i+ " ==============");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " +  j +" = " +i*j);

            }

        }

    }}