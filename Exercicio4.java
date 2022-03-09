public class Exercicio4 {
    
    public static void main (String[] args){
        int k = 10;
        int j = 8;
        System.out.println(somatorio(k, j));
    }

    public static int somatorio(int k, int j) {
        if (k == j) {
            return k;
        } else if (k > j){
            return j + somatorio(k, j+1);
        } else {
            return k + somatorio(k+1, j);
        }
    }
}
