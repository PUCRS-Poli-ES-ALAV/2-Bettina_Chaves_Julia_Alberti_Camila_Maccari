public class Exercicio5 {
    public static void main (String[] args){
        String s1 = "reviver";
        String s2 = "mesa";
        System.out.println(isPal(s1));
        System.out.println(isPal(s2));
    }

    public static boolean isPal(String s) {
        if (s.length() >= 0 && s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        } else {
            return isPal(s.substring(1, s.length()-1));
        }
    }
}
