//Exercice : Jours dans le mois
//1. Créer une variable mois de type entier
//2. Affecter une valeur à la variable mois
//3. Afficher le nombre de jours du mois
//4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un message d'erreur



package org.example.javaBases.baseInstructionsConditions;

import java.util.Scanner;

public class ExerciceJoursDansLeMois {
    public static void main(String[] args) {

        //1. Créer une variable mois de type entier
        int mois;
//2. Affecter une valeur à la variable mois
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier de 1 à 12");
        mois = scanner.nextInt();

        switch (mois) {

       case 1 -> System.out.println("janvier");
       case 2 -> System.out.println("fev");
       case 3 -> System.out.println("mars");
        case 4 -> System.out.println("avril");
        case 5 -> System.out.println("mai");
        case 6 -> System.out.println("juin");
        case 7 -> System.out.println("juillet");
        case 8 -> System.out.println("août");
        case 9 -> System.out.println("septembre");
        case 10 -> System.out.println("octobre");
        case 12 -> System.out.println("novembre");
        default -> System.out.println("vous n'avez pas saisi un nb entier de 1 à 12 ==> Aucune correspondance");
    }
    }}
// Entraînement du 02/0
//        switch (mois) {
//            case 1:
//                System.out.println("Il s'agit du mois de JANVIER");
//                break;
//
//            case 2:
//                System.out.println("Il s'agit du mois de FEVRIER");
//                break;
//
//            case 3:
//                System.out.println("Il s'agit du mois de MARS");
//                break;
//
//            case 4:
//                System.out.println("Il s'agit du mois de AVRIL");
//                break;
//
//            case 5:
//                System.out.println("Il s'agit du mois de MAI");
//                break;
//                case 6:
//                    System.out.println("Il s'agit du mois de JUIN");
//                    break;
//
//                case 7:
//                    System.out.println("Il s'agit du mois de JUILLET");
//                    break;
//
//                case 8:
//                    System.out.println("Il s'agit du mois de AOUT");
//                    break;
//
//                case 9:
//                    System.out.println("Il s'agit du mois de SEPTEMBRE");
//                    break;
//
//                case 10:
//                    System.out.println("Il s'agit du mois d'OCTOBRE");
//                    break;
//
//                case 11:
//                    System.out.println("il s'agit du mois de NOVEMBRE");
//
//                case 12:
//                    System.out.println("Il s'agit du mois de DECEMBRE");
//                break;
//
//                default:
//                    System.out.println("Vous n'avez pas saisi un entier de 1 à 12 comme demandé");
//                break;
//            }}}
//
//    }}

// Entrainement du 30/07 ==> ERREUR dans un Swuith pas d'{} après le case x :
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int mois;
//        System.out.println("saisir un nombre entier de 1 à 12 : ");
//        mois = scanner.nextInt();
////        switch (mois) {
//            case 1: {
//                System.out.println("Janvier");
//                break;
//            }
//            case 2: {
//                System.out.println("Février");
//                break;
//            }
//
//            case 3: {
//                System.out.println("Mars");
//                break;
//            }
//            case 4: {
//                System.out.println("Avril");
//                break;
//            }
//            case 5: {
//                System.out.println("Mai");
//                break;
//            }
//            case 6: {
//                System.out.println("Juin");
//                break;
//            }
//            case 7: {
//                System.out.println("Juillet");
//                break;
//            }
//            case 8: {
//                System.out.println("Août");
//                break;
//            }
//            case 9: {
//                System.out.println("Septembre");
//                break;
//            }
//            case 10: {
//                System.out.println("Octobre");
//                break;
//            }
//            case 11: {
//                System.out.println("Novembre");
//                break;
//            }
//            case 12: {
//                System.out.println("Décembre");
//                break;
//            }
//            default: {
//                System.out.println("vous n'avez pas saisi un nombre entier de 1 à 12 comme demandé ");
//            }
//        }
//
//        String annee[] = new String[12];
//
//        annee[1] = "janvier";
//        annee[2] = "fevr";
//        annee[3] = "mars";
//        annee[4] = "avr";
//        annee[5] = "janvier";
//        annee[6] = "janvier";
//
//        for (int i = 0; i >= 12; i++) {
//            System.out.println(annee[i]);
//        }

