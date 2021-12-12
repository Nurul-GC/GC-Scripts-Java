package artesgc.scripts.java;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero:\n> ");
        int n1 = input.nextInt();

        System.out.print("Digite outro numero:\n> ");
        int n2 = input.nextInt();

        int maior = n1>n2?n1:n2,  // Math.max(1, 2)
            menor = n1<n2?n1:n2;  // Math.min(1, 2)
        System.out.println("\nO maior valor e -> " + maior + "\nO menor valor e -> " + menor);
    }
}
