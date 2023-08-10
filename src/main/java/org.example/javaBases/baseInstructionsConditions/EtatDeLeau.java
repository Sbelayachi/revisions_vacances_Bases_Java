// ========== SLIDE 76 ===============
//Exercice : Etat de l'eau
//1. Définir une variable température
//2. Affecter une valeur à la variable temperature
//3. Selon la température, affiche l'état de l'eau :
//SOLIDE : température inférieure à 0°C
//LIQUIDE : température entre 0 et 100°C
//GAZEUX : température supérieure à 100°C

// ==================== entraînement du 3 août================================

//TODO : résoudre les exceptions + prob en cas de saisie d'un nombre négatif  ex -4 => le signe moins n'est pas pris en compte dans la saisie
package org.example.javaBases.baseInstructionsConditions;

import java.util.Scanner;

public class EtatDeLeau {
    public static void main(String[] args) {
        double temperature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une TEMPERATURE en Degré Celsius");
        temperature = scanner.nextDouble();
        temperature = Math.round(2);
        System.out.println("A cette température l'eau est à l'état : \n");

        if (temperature < 0) {
            System.out.println("==> SOLIDE : température inférieure à 0°C");
        }

        if (temperature > 0 && temperature < 100) {
            System.out.println("==> LIQUIDE : température entre 0 et 100°C ");
        } else {
            System.out.println("==> GAZEUX : température supérieure à 100°C");
        }
    }
}
