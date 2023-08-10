//Exercice : Somme des carrés -- SLIDE 53
//1. Écrire un programme avec les variables suivantes : a, b
//2. Afficher la somme des carrés de ces deux nombres

package org.example.baseCreationVariable;

import java.util.Scanner;

public class ExoSommeCarres {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double a,b,summCarre;
        System.out.println("Saisir un nb 'a' : ");
        a=scanner.nextInt();
        System.out.println("Saisir un nb 'b' : ");
        b= scanner.nextInt();

        System.out.println("Le nombre 'a' est : "+a);
        System.out.println("Le nombre 'a' est : "+b);

        summCarre= (a*a)+(b*b);
        System.out.println("METHODE 1 La somme des carrés est égale à  : "+summCarre);

        System.out.println();
        System.out.println(" ====METHODE 2==== ");
        double summCarreA= Math.pow(a,2);
        System.out.println("Le carré de a  est égal à  : "+summCarreA);
        double summCarreB= Math.pow(b,2);
        System.out.println("\nLe carré de b  est égal à  : "+summCarreB);
        System.out.println("La somme des carrés est égale à  : "+(summCarreA+summCarreB));

        System.out.println();
        System.out.println(" ====METHODE 3==== ");
        System.out.println("\n La somme des carrés est égale à  : "+((Math.pow(a,2))+(Math.pow(b,2))));

    }
    }



