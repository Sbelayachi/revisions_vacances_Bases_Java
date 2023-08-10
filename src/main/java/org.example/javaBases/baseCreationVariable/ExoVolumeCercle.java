///Exercice : volume d'un cercle -- SLIDE 55
//1. Créer un programme qui permet de calculer le volume d'un cône
//2. La formule est la suivante : 1/3 × π × r² × h


package org.example.javaBases.baseCreationVariable;

import java.util.Scanner;

public class ExoVolumeCercle {
    public static void main(String[] args) {
        double rayon, hauteur,volume;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une valeur en cm pour le RAYON du cercle");
        rayon=scanner.nextDouble();
        System.out.println("Veuillez saisir une valeur en cm pour la HAUTEUR  du cercle");
        hauteur=scanner.nextDouble();
        System.out.println("Pour un RAYON égal à : "+rayon+ " cm"+"\net une HAUTEUR égale à : "+hauteur+" cm");
        System.out.println("\n===METHODE 1 ===");
        volume= Math.pow(rayon,2)*hauteur*Math.PI/3;
        System.out.println("Pour un RAYON égal à : "+rayon+ " cm"+"\net une HAUTEUR égale à : "+hauteur+" cm");
        System.out.println("Le VOLUME DU CERCLE EST DE ===> " + Math.round(volume)+ " cm3");

        System.out.println("\n===METHODE 2 ===");
        volume= ((rayon*rayon)*hauteur*Math.PI)*1/3;
        System.out.println("Pour un RAYON égal à : "+rayon+ " cm"+"\net une HAUTEUR égale à : "+hauteur+" cm");
        System.out.println("Le VOLUME DU CERCLE EST DE ===> " + Math.round(volume)+ " cm3");

    }
}
