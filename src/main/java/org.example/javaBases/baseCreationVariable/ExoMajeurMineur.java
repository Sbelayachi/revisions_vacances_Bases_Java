//Exercice : majeur ou mineur
//1. Créer une variable age et lui affecter une valeur
//2. Vérifier si la personne est mineure ou majeure à l'aide des
//opérateurs logiques
//3. Afficher le résultat
//4. /!\ Ne pas utiliser de structure conditionnelle


package org.example.baseCreationVariable;

import java.util.Scanner;

public class ExoMajeurMineur {
    public static void main(String[] args) {

        int age;
        boolean estMineur = true ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre age : ");
        age=scanner.nextInt();
        estMineur=age<18 ;
        System.out.println(estMineur);
        System.out.println("\n SI 'true' ==> 'Vous êtes mineur(e)' \t \n SI 'false' ==> 'Vous êtes majeur(e)'");




    }
}
