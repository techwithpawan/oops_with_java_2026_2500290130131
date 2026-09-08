//using recursion

import java.util.*;

class CalcFactorial{
    public int CalcFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n* CalcFactorial(n-1);
    }
}

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        CalcFactorial obj = new CalcFactorial();
        int fact = obj.CalcFactorial(n);

        System.out.println("Factorial is : " + fact);
    }
}