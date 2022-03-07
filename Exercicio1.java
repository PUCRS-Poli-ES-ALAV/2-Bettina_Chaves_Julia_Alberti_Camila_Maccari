public class Exercicio1 {
     
    static int factorialWithRecursion(int n){    
    if (n == 0)    
        return 1;    
    else    
        return(n * factorialWithRecursion(n-1));    
    }
    
    public static void main(String args[]){  
        int i, x = 1;  
        int numberCalculate = 6;
        int fact = factorialWithRecursion(numberCalculate);   
        System.out.println("Factorial of "+numberCalculate+" is: "+fact);    
        }  
    
}
