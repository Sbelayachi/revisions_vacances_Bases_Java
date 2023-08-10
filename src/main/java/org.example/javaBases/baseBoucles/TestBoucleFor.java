
//for ("InitialisationVarifor ("InitialisationVariableBoucle" ; "ConditionDeRebouclage" ; "IncremetationDeLaBoucle" )
// {"Action à appliquer à chaque boucle"();}

//1. Créer une variable age
        //2. Affecter une valeur à la variable age
        //3. Créer une condition qui permet d'afficher si la personne est
        // majeure ou mineure

package org.example.javaBases.baseBoucles;

import java.util.Scanner;
public class TestBoucleFor {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir votre âge");
        age= scanner.nextInt();
        System.out.println("vous avez : \n" + age + "  an(s)");
        if (age > 17) {
            System.out.println("vous êtes majeur(e)");}
    else {
                System.out.println("vous êtes mineure");
            }
        }
    }



