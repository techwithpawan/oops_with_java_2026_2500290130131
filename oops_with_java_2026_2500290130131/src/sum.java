import java.util.*;

class PrintNumber{
    public void printNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        PrintNumber obj = new PrintNumber();
        obj.printNumber(n);
    }
}