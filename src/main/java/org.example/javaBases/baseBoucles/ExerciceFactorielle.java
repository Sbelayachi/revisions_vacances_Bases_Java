///Exercice : Factorielle
//1. La factorielle d'un nombre positif est le quotient cumulatif des nombres allant de 1 à ce nombre
//2. Exemple : la factorielle de 3 est 1 x 2 x 3 = 6
//3. Réaliser un programme qui affiche la factorielle d'un nombre
// TODO: 06/08/2023 exercice à refaire +++
package org.example.baseBoucles;

import java.util.Scanner;

public class ExerciceFactorielle {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        StringBuilder decomposition = new StringBuilder();
//
//        System.out.print("\nVeuillez entrer un nombre positif : ");
//        int nombre = scanner.nextInt();
//
//        int result = 1;
//
//        decomposition.append("1");
//
//        for (int i = 2; i < nombre + 1; i++) {
//            result *= i;
//            decomposition.append(" x " + i);
//        }
//
//        System.out.printf("%d! = %s = %d", nombre, decomposition, result);


        int nombre;
        Scanner scanner=new Scanner(System.in);
        System.out.println("saisir un nombre entier :");
        nombre=scanner.nextInt();

        int i,j;
        int factorielle;
        System.out.println("FACTORIELLE DE "+nombre+" : "+nombre+ "!");

        //Boucle 1 pour le nombre de mutliplications à faire
                for (i=1;i<nombre;i++) {
            System.out.println(nombre +"x" + (nombre-i));
        }}}


//       // Boucle 2 pour retirer 1 au nombre à mutiplier
//        for (j=0;j<=1;j--)
//        {factorielle =nombre*(nombre-j);
//
//            System.out.println("factorielle de nombre"+nombre:);
//            System.out.println();
//            System.out.println(j);
//            System.out.println(factorielle);
//            break;

//        System.out.println(" ===== La factorielle du nombre " +nombre +" est ======");
////        System.out.println(+factorielle);




