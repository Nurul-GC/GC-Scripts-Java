package artesgc.scripts.java;

public class comparators {
    public static void main(String[] args){
        System.out.println("1>2 -> " + (1>2));
        System.out.println("1<2 -> " + (1<2));
        System.out.println("1==2 -> " + (1==2));
        System.out.println("1!=2 -> " + (1!=2));

        // *************************************
        System.out.println("\n1>2 && 3<4 -> " + (1>2 && 3<4));
        System.out.println("1>2 || 3<4 -> " + (1>2 || 3<4));
    }
}
