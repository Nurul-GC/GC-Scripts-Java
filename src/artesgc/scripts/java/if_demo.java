package artesgc.scripts.java;

import java.util.Scanner;

public class if_demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a sua idade:\n> ");
        int idade = input.nextInt();

        if (idade < 0 || idade > 100){
            System.out.println("\nIdade inaceitavel!\nA idade deve estar entre os 0 e 100 anos...");
        }
        else if (idade < 18){
            System.out.println("\nLamento voce ainda e menor...");
        }
        else if (idade < 21){
            System.out.println("\nVoce precisa de autorizacao de seus pais...");
        }
        else{
            System.out.println("\nParabens!\nVoce esta habilitado a usar este programa...");
        }
    }
}
