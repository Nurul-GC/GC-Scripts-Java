package artesgc.scripts.java;

public class flags {
    public static void main(String[] args){
        // inteiros
        System.out.printf("%d-%d-%d", 7, 12, 1999);
        System.out.printf("%,d", 12345);  // separador de milhares (1,000)

        // decimais
        System.out.printf("%f", 62.3);
        System.out.printf("%.2f", 12.4);
        System.out.printf("%,.2f", 12345.56789);
    }
}
