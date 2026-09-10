public class Usecase1 {
    public static void main(String[] args) {
        Book b1 = new Book
    }
}

class Book{
    private String Title;
    private String author;
    private String price;
    private String isbn;
    final static String libaryname = "Sunrise";
    static int bookCount  = 0;

    Book(String t, String A, double p, String i){
        this.Title = t;
        this.author = a;
        this.price = p;
        this.isbn = i;
        ++bookCount;
    }
    public String getTitle(){
        return Title;
    }
    public void setTitle(String t){
        this.Title=t;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        this.Title=a;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(double p){
        this.price=p;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String i){
        this.isbn=i;
    }
}
