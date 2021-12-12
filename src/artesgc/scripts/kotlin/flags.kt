package artesgc.scripts.kotlin

fun main(){
    // inteiros
    System.out.printf("%d-%d-%d%n", 7, 12, 1999)
    System.out.printf("%,d%n", 12345) // separador de milhares (1,000)

    // decimais
    System.out.printf("%f%n", 62.3)
    System.out.printf("%.2f%n", 12.4)
    System.out.printf("%,.2f", 12345.56789)
}
