package artesgc.scripts.java;

import java.util.Arrays;

public class lists {
    public static void main(String[] args){
        int[] lista1 = {1, 2, 3, 4, 5},
              lista2 = {6, 7, 8, 9, 0},
              lista3 = {1, 2, 3, 4, 5};

        // ***********************************************
        boolean res1 = Arrays.equals(lista1, lista2),
                res2 = Arrays.equals(lista2, lista3),
                res3 = Arrays.equals(lista1, lista3);

        System.out.println("lista1 == lista2 -> " + res1);
        System.out.println("lista2 == lista3 -> " + res2);
        System.out.println("lista1 == lista3 -> " + res3);

        // ***********************************************
        System.out.println("lista1 = string -> " + Arrays.toString(lista1));

        // ***********************************************
        int foundIndex = Arrays.binarySearch(lista1, 39);
        System.out.println("39 in lista1 -> " + foundIndex);
    }
}
