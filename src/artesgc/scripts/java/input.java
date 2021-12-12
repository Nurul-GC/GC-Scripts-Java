package artesgc.scripts.java;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:\n> ");
        int n1 = reader.nextInt();

        System.out.print("Digite um numero decimal:\n> ");
        double n2 = reader.nextDouble();

        reader.nextLine();
        System.out.print("Digite qualquer coisa:\n> ");
        String str = reader.nextLine();

        // resultados
        System.out.printf("%nnumero inteiro = %d.%n", n1);
        System.out.printf("numero decimal = %.2f.%n", n2);
        System.out.printf("string = \"%s\".", str);
    }
}
