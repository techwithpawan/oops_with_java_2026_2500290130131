class Student {
    String name;
    int rollno;

    void display(){

        System.out.println(name + " - " + rollno);
    }
    }
    public class std{
       public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pawan";
        s1.rollno = 120;

        Student s2 = new Student();
        s2.name = "Praveen";
        s2.rollno = 126;

        s1.display();
        s2.display();
}}

