public class Exercicio6 {

      public static void main (String[] args){
        
        System.out.println(convBase2(2));
        System.out.println(convBase2(0));
        System.out.println(convBase2(1));
    }

    public static String convBase2 (int n) {
        if (n == 1) {
            return "1";
        } else if (n == 0) {
            return "0";
        }
        else { 
            return convBase2(n/2)+(n%2);
        }
    }
}