///Exercice : majeur ou mineur  == slide 68
//1. Créer une variable age
//2. Affecter une valeur à la variable age
//3. Créer une condition qui permet d'afficher si la personne est majeure ou mineure


package org.example.javaBases.baseInstructionsConditions;

import java.util.Scanner;

public class ExerciceMajeurMineur {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int age;
        System.out.println("Veuillez saisir votre âge : ");
        age=scanner.nextInt();
if (age<18){
    System.out.println("Vous avez : "+age +" ans, vous êtes donc MINEU(E), vous ne pouvez pas rentrer dans le club");
}
else {
    System.out.println("Vous avez : "+age +" ans, vous êtes donc MAJEUR(E), vous pouvez rentrer dans le club");

}
    }
}
