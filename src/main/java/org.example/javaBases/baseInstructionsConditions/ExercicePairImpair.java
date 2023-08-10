// Exercice : Pair ou impair == SLIDE 69
//1. Créer une variable nombre de type entier
//2. Affecter une valeur à la variable nombre
//3. Créer une condition qui permet d'afficher si le nombre est pair ou impair


package org.example.baseInstructionsConditions;

import java.util.Scanner;

public class ExercicePairImpair {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nombre;

        System.out.println("Saisir un nombre entier : ");
        nombre = scanner.nextInt();
        if (nombre % 2 == 0) {
            System.out.println("Le nombre saisi est pair");
        }
        else {System.out.println("Le nombre saisi est impair");}
    }
}