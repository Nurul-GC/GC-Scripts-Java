package artesgc.scripts.java;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a sua nota final:\n> ");
        String valor = input.nextLine().toUpperCase();

        switch (valor) {
            case "A" -> System.out.println("\nParabens...");
            case "B" -> System.out.println("\nBoa, mais concentracao na proxima...");
            default -> System.out.println("\nUps, voce precisa estudar mais...");
        }
    }
}
