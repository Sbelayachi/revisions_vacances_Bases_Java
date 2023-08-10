//      ============= Exercice : Population =============
//      =============  SLIDE 81 ===================

//1. L'accroissement de la population de Tourcoing est de 0.89%
//2. En 2015 la ville comptait 96809 habitants
//3. Combien d'années faut-il pour atteindre 120 000 habitants ?
//4. Combien d'habitants y aura-t-il cette année-là ?
//5. Écrire un programme permettant de résoudre ce problème


// entrainement 03 aout

package org.example.javaBases.baseBoucles;

public class ExercicePopulation {
    public static void main(String[] args) {

        double habitants = 96809;
        int annee = 2015;
        int i = 0;
while (habitants<120000){
    habitants=habitants+(habitants*0.89/100);
    i++;
    System.out.println("année  " + i + "  "+ "\n"+Math.round(habitants) +"  habitants");

}
System.out.println("La population de Tourcoing dépassera les 120 000 habitants en " + (i+annee) + " avec : "+Math.round(habitants) + " habitants");
    }}

//package org.example.baseBoucles;
//
//public class ExercicePopulation {
//public static void main(String[] args) {
//        // exercice slide 81
//        int annee = 2015;
//        double population = 96_809;
//
//        while (population < 120_000) {
//        population *= 1.0089;
//        annee++;
//        }
//
//        System.out.printf("La population de Tourcoing dépassera les 120 000 habitants en %s pour %s habitants", annee, (int) Math.ceil(population));
//        }
//
//        }