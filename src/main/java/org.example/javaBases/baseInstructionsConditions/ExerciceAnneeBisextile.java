//Exercice : Année bissextile
//1. Créer une variable annee de type entier
//2. Affecter une valeur à la variable annee
//3. Une année est bissextile si elle est divisible par 4 mais non divisible par 100.
//4. L'année est également bissextile si elle est divisible par 400



// entrainement => exo refait le 02/08
package org.example.javaBases.baseInstructionsConditions;
import java.util.Scanner;
public class ExerciceAnneeBisextile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("veuillez saisir une année [nombre entier sans espace sans virgule, et sans caractère spécial]");
        year= scanner.nextInt();

        if ((year%4==0 || year%400==0) && year%100!=0)
        {
            System.out.println(year+ " = est une année BISEXTILE");
        }
        else
    {
        System.out.println(year+ " = n'est pas une année BISEXTILE");}
}}
