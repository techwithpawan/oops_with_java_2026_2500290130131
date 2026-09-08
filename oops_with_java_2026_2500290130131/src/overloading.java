class Addition{
    void sum(){
        System.out.print("Addition");
    }

    void sum(int a, int b){
        System.out.println("Addition: " +(a+b));
    }

    static void sum(double a, double b){
        System.out.println("Addition : " + (a+b));
    }
}

public class overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
        obj.sum(10,4);
        obj.sum(10.1,12.1);

    }
}
