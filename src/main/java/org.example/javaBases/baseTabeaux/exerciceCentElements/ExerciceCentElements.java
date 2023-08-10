// =============   Exercice : 100 éléments   =============
// =============   SLIDE 94   =============

//1. Déclarer un tableau de 100 éléments et l'initialiser
//2. Afficher les éléments par dizaine séparés d'une virgule


// entrainement du 06/08
// TODO: 06/08/2023 a refaire ++++++ 
package org.example.javaBases.baseTabeaux.exerciceCentElements;

import java.util.Arrays;

public class ExerciceCentElements {
    public static void main(String[] args) {
        int[] tableau = new int[100];

        int[] ligne1=new int [10];
        int[] ligne2=new int [10];
        int[] ligne3=new int [10];
        int[] ligne4=new int [10];
        int[] ligne5=new int [10];
        int[] ligne6=new int [10];
        int[] ligne7=new int [10];
        int[] ligne8=new int [10];

        for (int i = 0; i < 10; i++) {
            ligne1[i] = i;}
        System.out.println(Arrays.toString(ligne1));

        for (int i = 0; i < 10; i++) {
            ligne2[i] = (i+10);}
        System.out.println(Arrays.toString(ligne2));

        for (int i = 0; i < 10; i++) {
            ligne3[i] = (i+20);}
        System.out.println(Arrays.toString(ligne3));

        for (int i = 0; i < 10; i++) {
            ligne4[i] = (i+30);}
        System.out.println(Arrays.toString(ligne4));


        for (int i = 0; i < 10; i++) {
            ligne5[i] = (i+40);}
        System.out.println(Arrays.toString(ligne5));

        for (int i = 0; i < 10; i++) {
            ligne6[i] = (i+50);}
        System.out.println(Arrays.toString(ligne6));

        }}
//for (int i = 0; i < 10; i++) {
//        tableau[i] = (i * 10)+1;
//        System.out.println(tableau[i]);
//
//        }

//        for (int j = 0; j < 10; j++) {
//            j=((i*10)+1);
//            tableau[j] = j;
//            System.out.println(tableau[i] + " ," + tableau[j]);




//            if (j % 10 == 9) {
//                System.out.print(tableau[j] + "\n");
//            } else {
//                System.out.print(tableau[j] + ", ");
//            }






//        int i;
//        int[] tableau = new int[100];
//
//
//    for ( i =0;i<100;i++)
//    {
//        tableau[i]=(i+10);
//        System.out.println(tableau[i]);    }
//
//    }
//}
