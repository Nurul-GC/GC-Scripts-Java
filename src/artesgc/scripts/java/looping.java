package artesgc.scripts.java;

public class looping {
    public static void main(String[] args){
        // *****************************
        for (int n = 0; n<5; n++){
            System.out.print(n);
        }System.out.println();

        // *****************************
        int[] numeros = {1, 2, 3, 4, 5};
        for (int n: numeros){
            System.out.print(n);
        }System.out.println();

        // *****************************
        int n = 5;
        while (n>0){
            System.out.println("n = " + n);
            n--;
        }
        do{
            System.out.println("n = " + n);
            n++;
        }while (n<5);
    }
}
