//Exercice : Jour de la semaine  ==> SLIDE 72
//1. Créer une variable jour de type entier
//2. Affecter une valeur à la variable jour
//3. Afficher le jour de la semaine en lettre en fonction du nombre passé
//4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message d'erreur


package org.example.baseInstructionsConditions;

import java.util.Scanner;

public class ExerciceJoursDeLaSemaine {
    public static void main(String[] args) {

        int jour;

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre entier de 1 à 7");
        jour = scanner.nextInt();

        switch (jour) {

            case 1:
                System.out.println("lundi");
                break;
            case 2:
                System.out.println("mardi");
                break;
            case 3:
                System.out.println("mercredi");
                break;
            case 4:
                System.out.println("jeudi");
                break;
            case 5:
                System.out.println("vendredi");
                break;
            case 6:
                System.out.println("samedi");
                break;
            case 7:
                System.out.println("dimanche");
                break;
            default:
                System.out.println("vous n'avez pas saisi un nombre compris entre 1 et 7, comme demandé");
        }
    }
}
//switch (variable)
//{
// case ‘valeur1’ :
// Instruction1;
// break ;
// case ‘valeur2’ :
// Instruction2;
// break ;
// case ‘valeur3’ : ‘valeur4’ :
// Instruction3;
// break ;
// default :
// DefaultInstruction1;
// break ;
//}


