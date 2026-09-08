class Calculator {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add (double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
public class  std1{

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2,6));
        System.out.println((c1.add(5,6)));
        System.out.println(c1.add(2.3,6.5));
    }
}
