// ===========  Exercice : Candidature ============== SLIDE 77===============

//1. Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
//2. Le profil contient trois critères :
//age : supérieur à 30 ans
//salaire demandé : maximum 40 000€
//années d'expériences : minimum 5 ans
//3. Afficher un message pour chaque condition non respectée


// entrainement du 3 août
package org.example.baseInstructionsConditions;
import java.util.Scanner;
public class Candidature {
    public static void main(String[] args) {
        int age,anneeExperience;
        double salaireDemande;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir votre age ?");
        age= scanner.nextInt();
        System.out.println("Quel est le salaire minimum attendu (en euros) ? ");
        salaireDemande =scanner.nextDouble();
        System.out.println("Quel est votre nombre d'années d'expérience ? ");
        anneeExperience =scanner.nextInt();

        if (age<30)
        {
            System.out.println("==> vous n'entrez pas dans les critères du fait de votre age inférieur à 30 ans" );
            }
        if (salaireDemande>40_000)
        {
         System.out.println("==> vous n'entrez pas dans les critères du fait de vos prétention en terme de salaire (max 40 000 euros/an)");
        }
        if (anneeExperience<5)
        {     System.out.println("==> vous n'entrez pas dans les critères du fait de manque d'expérience : inf à 5 ans");
    }
        if (age<30 && salaireDemande>40_000 && anneeExperience<5){
            System.out.println("==> Désolée mais vous n'entrez AUCUN des critères requis en termes d'âge , d'expérience et de salaire attendu");
        }
        if (age>30 && salaireDemande<40_000 && anneeExperience>5){
            System.out.println("\n ==> Désolée mais vous n'avez AUCUN des critères requis en termes d'âge , d'expérience et de salaire attendu");
        }
    }
}