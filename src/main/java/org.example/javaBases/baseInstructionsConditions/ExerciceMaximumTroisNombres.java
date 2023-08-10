// Exercice : Maximum de 3 nombres == SLIDE 70
//1. Créer 3 variables : nombre1, nombre2, nombre3
//2. Affecter des valeurs aux variables
//3. Créer des structures conditionnelles permettant d'afficher le maximum parmis les 3 nombres créésprécédemment



package org.example.baseInstructionsConditions;

import java.util.Scanner;

public class ExerciceMaximumTroisNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nombre1, nombre2, nombre3;

        System.out.println("veuillez saisir un nombre 1 :");
        nombre1 = scanner.nextDouble();
        System.out.println("veuillez saisir un nombre 2 :");
        nombre2 = scanner.nextDouble();
        System.out.println("veuillez saisir un nombre 3 :");
        nombre3 = scanner.nextDouble();

        if (nombre1 > nombre2 && nombre1 > nombre3) {
            System.out.println("le nombre 1 est le nombre maximum");
        }
        else if (nombre2 > nombre1 && nombre2 > nombre3) {
            System.out.println("le nombre 2 est le nombre maximum");
        }
        else  {
            System.out.println("le nombre 3 est le nombre maximum");
    }
}}