//Create a book class with title, author, and price. Initilize all fields using a parameterized constructor and Display the details
package JPT_Day04;

public class Exercise05 {
    public static void main(String arg[]){
        Book b1 = new Book("Java Devloper", "Shubham", 1000);
        b1.display();
    }
}

class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title:" + title);
        System.out.println("Author name:"+ author);
        System.out.println("Price:"+ price);
    }
}