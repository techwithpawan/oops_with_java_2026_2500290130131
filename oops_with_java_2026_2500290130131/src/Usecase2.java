public class Usecase2 {
    
}

abstract class shape{
    abstract double area();
    void displayArea(){
        System.out.println("Area = " + area());
    }
}

class Circle extends shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    double area(){
        return 22/7.0*radius*radius;
    }
}

class rectangle extends shape{
    double length;
    double width;
    Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }
    double area(){
        return length*width;
    }
}