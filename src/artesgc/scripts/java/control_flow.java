package artesgc.scripts.java;

public class control_flow {
    public static void main(String[] args){
        boolean value1 = 1==1 && 2!=3,
                value2 = 2!=2 || 3==4;

        if (value1){
            System.out.println("value1 = 1==1 && 2!=3 -> " + true);
        }
        else{
            System.out.println("value1 = 1==1 && 2!=3 -> " + false);
        }

        if (!value2){
            System.out.println("value2 = 2!=2 || 3==4 -> " + false);
        }
        else{
            System.out.println("value2 = 2!=2 || 3==4 -> " + true);
        }

        if (value1 != value2){
            System.out.println("value1 != value2 -> " + true);
        }
        else{
            System.out.println("value1 != value2 -> " + false);
        }
    }
}
