///Exercice : Voyelle ou consonne == SLIDE 71
//1. Créer une variable caractere
//2. Affecter une valeur à la variable caractere
//3. A l'aide des structures conditionnelles, déterminer si le caractère est une consonne ou une voyelle



//============================= Methode 2 entraînement du 03/08 ======================================
package org.example.javaBases.baseInstructionsConditions;

import java.util.Scanner;

public class ExerciceVoyelleConsonne {
    public static void main(String[] args) {

        char letter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("vueillez saisir un caractère alaphabétique");
        letter = scanner.next().toLowerCase().charAt(0);

        if (letter >= 'a' && letter <= 'z')
        {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y')
            { System.out.println("Vous avez saisi une voyelle"); }
            else {System.out.println("Vous avez saisi une voyelle");}
        }

        else {
            System.out.println("vous n'avez pas saisi de caractère alphabétique ");
        }
    }
}



//================================================================================================
//// Methode 1 entraînement du 02/08
//package org.example.baseInstructionsJava;
//
//import java.util.Scanner;
//
//public class ExerciceVoyelleConsonne {
//    public static void main(String[] args) {
//        char letter;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuilez saisir une lettre de a à z");
//        letter = scanner.next().toLowerCase().charAt(0);
//        System.out.println("votre saisie : " + letter);
//
//        if ((letter >= 'a' && letter <= 'z') && (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'))
//        {
//            System.out.println("Vous avez saisi une voyelle");}
//
//    else if ((letter >= 'a' && letter <= 'z') && (letter != 'a' || letter != 'e' || letter != 'i' || letter != 'o' || letter != 'u' || letter != 'y'))
//            {                System.out.println("vous avez saisi une consonne ");}
//            else
//            {   System.out.println("vous n'avez pas saisi de caractère alphabétique ");
//            }
//        }
//    }

///====================Entrainement===============

//package org.example.baseInstructionsJava;
//
//import java.util.Scanner;
//
//public class ExerciceVoyelleConsonne {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        char caractere;
//        System.out.println("veuillez saisir un caractère : ");
//        caractere=scanner.next().toLowerCase().charAt(0);
//        if (caractere!= 'a' ||caractere != 'e' ||caractere != 'i'||caractere != 'o'||caractere != 'u'||caractere != 'y') {
//            System.out.println("Le caractère saisi est une consonne");}
//            else {
//            System.out.println("Le caractère saisi est une VOYELLE");}
//
//    }
//
//
//}