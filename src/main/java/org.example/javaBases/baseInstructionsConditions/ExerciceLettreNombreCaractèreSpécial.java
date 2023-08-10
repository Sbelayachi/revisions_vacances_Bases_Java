///1. Créer une variable caractere == SLIDE 75
//2. Affecter une valeur à la variable caractere
//3. Afficher un message en fonction du type du caractère (lettre,//nombre, ou caractère spécial)



package org.example.baseInstructionsConditions;


import java.util.Scanner;

public class ExerciceLettreNombreCaractèreSpécial {
    public static void main(String[] args) {

        char letter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir une touche sur le clavier");
        letter = scanner.next().charAt(0);

        System.out.println("\n vous avez saisi :\t " + letter);

        if (Character.isAlphabetic(letter)) {
            System.out.println("vous avez saisi un caractère alphabétique");
        }
//============== méthode 2 : avec Character.isLetter on renvoie excactement le même résultat que le Character.isAlphabétic
//         if (Character.isLetter(letter))
//         {
//            System.out.println("vous avez saisi un caractère alphabétique");
//           }
//       sinon possibilté avec : if (letter >= 'a' && letter <= 'z') {}
        if (Character.isDigit(letter)) {
            System.out.println("vous avez saisi un caractère numétique");
        }
         else {
            System.out.println("vous avez saisi un caractère spécial");
        }
    }

}