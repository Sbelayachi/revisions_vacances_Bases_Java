//==========  Exercice : Chapitres  ==============
//==========    SLIDE 79  ==============

//1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
//2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à
//afficher


//========REVISION DU 3 AOUT
package org.example.javaBases.baseBoucles;
import java.util.Scanner;
public class ExerciceChapitres                    {
    public static void main(String[] args)      {
int nombreChapitre, nombreSouspartie;
Scanner scanner = new Scanner(System.in);
        System.out.println("veuiller saisir un nombre de chapitre(s) : ");
        nombreChapitre= scanner.nextInt();
        System.out.println("veuiller saisir un nombre de sous-partie(s) : ");
        nombreSouspartie= scanner.nextInt();

    for (int i = 1;i<=nombreChapitre;i++)
    {
        System.out.println("\nChapitre  " + i);
        {
            for (int j=1;j<=nombreSouspartie;j++)
            {
            System.out.println("\t Sous Partie "+i+"."+j);
            }
        }
    }
}}
