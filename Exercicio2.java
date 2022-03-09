public class Exercicio2{
    static int recursionSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recursionSum(n - 1);
    }
     
    // Driver code
    public static void main(String args[])
    {
        int x = 4;
        System.out.println(recursionSum(x));
    }
}