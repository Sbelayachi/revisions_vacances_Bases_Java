// =================  Exercice : Notes =============================
// ===== SLIDE 82 ===


//1. Créer une variable stockant le nombre de notes à saisir
//2. Afficher la note la plus haute
//3. Afficher la note la plus basse
//4. Afficher la moyenne des notes
//5. /!\ la note doit être comprise entre 0 et 20

package org.example.javaBases.baseBoucles;

import java.util.Scanner;

public class ExerciceNote {
    public static void main(String[] args) {

        int nombreNotes;
        double note = 0, noteMax = 0, noteMin = 0, moyenneNotes = 0;
        int iCompteur;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un NOMBRE DE NOTES");
        nombreNotes = scanner.nextInt();

        for (iCompteur = 1; iCompteur <= nombreNotes; iCompteur++) {
            System.out.println(iCompteur + ")  Saisir la NOTE  " + iCompteur + ":\n => note de 0 à 20 svp");
            note = scanner.nextDouble();

            while (note <= 0 || note > 20) {
                System.out.println("==> " + Math.round(note) + " n'est pas compris entre 0 et 20");
                System.out.println(iCompteur + "..)  Veuillez re-saisir la NOTE " + (iCompteur) + ": \n(Note de 0 à 20 svp) ");
                note = scanner.nextDouble();
            }

            if (iCompteur == 1) {
                noteMax = note;
                noteMin = note;
            }
            if (note > noteMax) {
                noteMax = note;
            }

            if (note < noteMin) {
                noteMin = note;
            }

            moyenneNotes += (note) / nombreNotes;

        }
        System.out.println("La note max est : " + noteMax);
        System.out.println("La note min est : " + noteMin);
        System.out.println("La moyenne est de : " + moyenneNotes);
    }}

// TODO: 05/08/2023 a refaire avec un tableau 



//        while (note >= 0 || note<= 20) {
//            System.out.println(" - Votre note  = " + iCompteur + note + " //20");
//            iCompteur++;






//              while (note >= 0 || note <= 20)
//              {System.out.println("recap de vos notes : NOTE " + i + " = " + note + "//20");
//        }
//        }}}
//
//                //                noteMin = note;
//                noteMax = note;
//            }
//
//            if (note > noteMax) {
//                noteMax = note;
//            }
//








        //===== entraînement du 05/08

//        Scanner scanner = new Scanner(System.in);
//        int nombreNotes;
//        System.out.println("Saisir un nombre de note");
//        nombreNotes = scanner.nextInt();
//
//        double note;
//        int i = 1;
//
//
//
//        while (i <= nombreNotes) {
//            System.out.println("Veuillez saisir la NOTE " + i++ + " :");
//            note = scanner.nextDouble();
//
//            if (note < 0 || note > 20)
//
//            {
//                System.out.println("veuillez re-saisir une note comprise entre 0 et 20");
//                note = scanner.nextDouble();
//                System.out.println("La note " + (i-1) + " est : " + note+" , merci d'avoir corrigé !!! \n");
//            }
//
//
////            else
////            {
////                System.out.println("la note " + i++ + " est :" + note);
////            }
//
//        }
//        int[] recapNotes = new int[nombreNotes] ;
//        System.out.println("vos notes sont :");
//
//        }}
//