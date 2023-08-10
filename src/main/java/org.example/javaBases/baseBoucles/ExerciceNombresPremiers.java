// ============================ Exercice : Nombres premiers ================================
//         =====   SLIDE 82   =====
//1. Un nombre premier est un nombre divisible par 1 et par soit-même uniquement
//2. 1 n'est pas un nombre premier
//3. Écrire un programme qui permet de savoir si un nombre est premier

// TODO: 05/08/2023 a refaire !!!!!!! 
package org.example.baseBoucles;

import java.util.Scanner;

public class ExerciceNombresPremiers {
    public static void main(String[] args) {

        int nombre;

        System.out.println("============Nombre PREMIER=======================\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir nombre entier");
        nombre = scanner.nextInt();
        int i=1;

        if (nombre == 1)
        {
            System.out.println("\"Attention ! Le nomre : " + nombre +  " n'est pas un nombre premier car il n'a qu'un seul diviseur entier positif => lui-même");
        }

    for (i=2; i<nombre;i++)
    {
    System.out.println("nb premier");}

        System.out.println(nombre +  " n'est pas un nombre premier");

}
    }
