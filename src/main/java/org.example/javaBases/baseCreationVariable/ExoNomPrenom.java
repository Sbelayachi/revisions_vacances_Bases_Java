// SLIDE 51
//Exercice : Prénom nom
//1. Créer une variable nom et une variable prenom
//2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
//3. Remplacer les valeurs entre chevrons par les variables créées
//précédemment


package org.example.baseCreationVariable;

import java.util.Scanner;

public class ExoNomPrenom {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String nom,prenom;

        System.out.println("Veuillez saisir votre nom");
        nom = scanner.nextLine();
        System.out.println("Veuillez saisir prenom");
        prenom=scanner.nextLine();
        System.out.println("Votre nom est : "+ nom);
        System.out.println();
        System.out.println("Votre prenom est : "+ prenom);
        System.out.println();
        System.out.println("BONJOUR : \n" + prenom+"  " +nom +" !");
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String nom,prenom;
//
//        System.out.println("veuillez saisir votre nom : ");
//        nom = scanner.nextLine();
//        System.out.println("CONFIRMATION : mon nom est bien  : "+nom);
//
//
//        System.out.println();
//
//        System.out.println("veuillez saisir votre prenom : ");
//
//        prenom = scanner.nextLine();
//        System.out.println("CONFIRMATION : mon prenom est bien  : "+prenom);
//
//
//        System.out.println("Bonjour !  " + nom + "  " +prenom);
//
//    }