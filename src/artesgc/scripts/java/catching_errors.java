package artesgc.scripts.java;

import java.util.Scanner;

public class catching_errors {
    public static void main(String[] args){
        int num, denom;
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Digite o numerador:\n> ");
            num = input.nextInt();

            System.out.print("Digite o denominador:\n> ");
            denom = input.nextInt();

            System.out.println("A divisao entre " + num + " e " + denom + " = " + (num/denom));
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }finally {
            System.out.println("---- FINAL DO TESTE ----");
        }
    }
}
