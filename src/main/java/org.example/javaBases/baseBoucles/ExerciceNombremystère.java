//Exercice : Nombre mystère ==== SLIDE 85
//1. Générer un nombre aléatoire entre 1 et 100
//2. Faire saisir un nombre à l'utilisateur
//3. Si le chiffre saisi est plus grand, écrire : Le nombre est plus petit
//4. Si le chiffre saisi est plus petit, écrire : Le nombre est plus grand
//5. Si le chiffre saisi est égal au chiffre aléatoire, écrire : Vous avez gagné en X tentatives

// TODO: 06/08/2023 essayer de simplifier le code
package org.example.baseBoucles;

import java.util.Random;
import java.util.Scanner;

public class ExerciceNombremystère {
    public static void main(String[] args) {

        Random random = new Random();
        double randomNumber = random.nextDouble(100);
        System.out.println("\nGénérer un nombre aléatoire entre 1 et 100 : " + (Math.round(randomNumber) ));
        int nombreMystere = (int) Math.round(randomNumber);



        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSaisir un nombre - Ceci est votre premier essai ! \n==>");
        double myNumber = (int) Math.round(scanner.nextDouble());

        int nombreEssai = 1;


        while (nombreEssai != nombreMystere) {
            while (myNumber > nombreMystere || myNumber < nombreMystere) {
                if (myNumber > nombreMystere) {
                    System.out.println("\nDOMMAGE => Le nombre est plus PETIT");
                    System.out.println("\n ===== RETENTEZ VOTRE CHANCE : Essai N°" + (nombreEssai+1) + " =====");
                    System.out.println("Veuillez saisir un nombre INFERIEUR à  " + myNumber + "\n");
                    myNumber = scanner.nextDouble();
                }

                if (myNumber < nombreMystere) {
                    System.out.println("\nDOMMAGE => Le nombre est plus GRAND");
                    System.out.println("\n ===== RETENTEZ VOTRE CHANCE : Essai N°" + (nombreEssai+1) + " =====");
                    System.out.println("Veuillez saisir un nombre SUPERIEUR à  " + myNumber + "\n");
                    myNumber = scanner.nextDouble();
                }
                nombreEssai++;
            }
            System.out.println("\n========== BRAVO !!!! ==========\n"  );
            System.out.println("===> Le nombre mystère était bien : "+nombreMystere);
            System.out.println("***** Vous avez gagné en " + nombreEssai + " tentatives");
            break;
        }
    }}


//            while (number < randomNumber) {
//                System.out.println("\nDOMMAGE => Le nombre est plus grand");
//                System.out.println("\n ===== RETENTEZ VOTRE CHANCE : Essai N°" + nombreEssai++ +" =====");
//                System.out.println("Veuillez saisir un nombre SUPERIEUR à :  "+number+"\n");
//                number=scanner.nextDouble();





//        for (randomNumber=randomNumber;randomNumber!=number;randomNumber++)  {
//            if (number>randomNumber) {
//                System.out.println("Le nombre est plus petit - essai N° "+nombreEssai);
//                System.out.println("Veuillez retenter");
//                System.out.println("Saisir un nombre ");
//            }
//            else if (number<randomNumber){
//                System.out.println("Le nombre est plus grand- essai N° "+nombreEssai);
//            }
