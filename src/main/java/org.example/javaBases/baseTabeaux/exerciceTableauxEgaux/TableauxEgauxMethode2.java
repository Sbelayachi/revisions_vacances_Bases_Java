package org.example.baseTabeaux.exerciceTableauxEgaux;


public class TableauxEgauxMethode2 {
    public static void main(String[] args) {


        int[] tableau1 = {1, 2, 3, 4};
        int[] tableau2 = {1, 2, 3, };
        int[] tableau3 = {1, 2, 4, 3};
        int[] tableau4 = {1, 2, 3,};

        boolean isEqual =true ;


        if (tableau1.length==tableau2.length)
        {
            for (int i=0;i<tableau1.length;i++) {

                if (tableau1[i] != tableau2[i]) {
                    isEqual = false;
                    break;
                }
            }}
            else {
                    isEqual = false;
                }

            if (isEqual)
            {
                System.out.println("les tableaux sont égaux");}
            else
            {
                System.out.println("les tableaux NE SONT PAS égaux");}

    }}