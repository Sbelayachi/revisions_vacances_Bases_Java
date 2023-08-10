//Exercice : Permuter deux variables - SLIDE 52

//1. Écrire un programme qui permet de permuter les valeurs entre 2 variables

//Saisir a :
//5
//Saisir b :
//3
//a = 3 et b = 5

package org.example.baseCreationVariable;

import java.util.Scanner;

public class ExoPermutationDeuxVariables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a,b,permut;

        System.out.println("Saisir un nombre a : ");
        a=scanner.nextInt();
        System.out.println("Saisir un nombre b : ");
        b=scanner.nextInt();
        System.out.println("AVANT PERMUTATION : \n"+ "a = "+a+"\nb = " +b);

permut=a;
a=b;
b=permut;
        System.out.println("AVANT PERMUTATION : \n"+ "a = "+a+"\nb = " +b);

    }
}




//    public static void main(String[] args) {
//        // déclaration de a et b (type)
//        double a;
//        double b;
//        double tempp;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("veuillez saisir un nombre a : ");
//        a= scanner.nextDouble();
//        System.out.println("nombre a = : "+a);




























































