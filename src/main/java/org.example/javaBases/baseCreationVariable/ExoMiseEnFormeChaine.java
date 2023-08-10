///Exercice : Mise en forme de chaînes
//1. Saisir une chaine et la stocker dans une variable
//2. Effectuer les traitements suivants :
//1. Afficher la chaîne en minuscule
//2. Afficher la chaîne en majuscule
//3. Bonus
//1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
//2. Afficher la première lettre de chaque mot en majuscule

package org.example.javaBases.baseCreationVariable;

import java.util.Scanner;

public class ExoMiseEnFormeChaine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Saisir une chaine et la stocker dans une variable
        String chaine;

        System.out.println("Veuillez saisir une phrase avec majuscules et minuscules aléatoires");
        chaine = scanner.nextLine();
        //1. Afficher la chaîne en minuscule
        String chaineMin=chaine.toLowerCase();
        System.out.println("Affichage de la phrase en minuscules : \n" +chaineMin );
        //2. Afficher la chaîne en majuscule
        String chaineMaj=chaine.toUpperCase();
        System.out.println("\n Affichage de la phrase en majuscules : \n" + chaineMaj);

// afficher les mots séparés d'une virgule
        String chaineVirgule = chaine.replace(" ", ",");
        System.out.println("\n" + chaineVirgule);
        String chaineVirgulemin = chaineMin.replace(" ", ",");
        System.out.println("\n" + chaineVirgulemin);
        String chaineVirgulemaj = chaineMaj.replace(" ", ",");
        System.out.println("\n" + chaineVirgulemaj);

// //1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
//        String[] motsChaine = chaine.split(" ");
//        for (String mots : motsChaine) {
//            System.out.println(mots.substring(1, 0).toUpperCase());
//
        String chainVirgule = String.join(" ,", chaineMin.split(""));
        System.out.println(chainVirgule);

            String[] motsChaine = chaineMin.split(" ");
            String chaineCapitale = "";

            for(String mot : motsChaine){
                chaineCapitale = chaineCapitale + mot.substring(0,1).toUpperCase() + mot.substring(1)+ " ";
            }

//        for(String mot : motsChaine){
//            String chaine = chaine + mot.substring(0,1).toUpperCase() + mot.substring(1)+ " ";
//        }
//            System.out.println(chaine);

        }
    }

//BoNjour Je M'aPpeLle SaLIha eT VoUs