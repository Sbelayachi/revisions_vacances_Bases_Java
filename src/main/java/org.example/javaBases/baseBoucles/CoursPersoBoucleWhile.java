//     While= "tant que".
//     ==> intermédiaire entre la boucle for et l'instruction if.
//     La boucle while est une boucle, donc elle permet de répéter des instructions comme la boucle for.
//     Non pas à partir d'un intervalle, mais à partir d'une condition comme l'instruction if.
//
//Voici ce que ça donne :
//                              while expressionlogique {
//                              instruction1
//                              instruction2
//                              instruction3
//                              ...
//                          }
// On peut le lire comme "Tant que l'expression logique est vraie, effectue les instructions suivantes".
//      Voilà comment ça fonctionne dans le détail :
//      1- Le programme vérifie que  expressionlogique  est vraie.
//      2- Si elle est fausse :  => les instructions entre accolades  {}  sont ignorées.
//                                => On passe à la suite du programme.
//      3 - Si elle est vraie : les instructions entre accolades  {}  sont exécutées.
//
//      ===>>>   Une fois les instructions exécutées, on revient au point 1.

//EXEMPLE :

package org.example.baseBoucles;

public class CoursPersoBoucleWhile {
    public static void main(String[] args) {

        var nombreDeMoutons = 0;

        while (nombreDeMoutons < 10) {
            nombreDeMoutons += 1;
            System.out.println("Je compte " +nombreDeMoutons+ " moutons");
        }

        System.out.println("Je ne suis tjrs pas endormie après "+nombreDeMoutons+"  moutons !!!!!!");
    }
    }
