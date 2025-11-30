// Create a class called "Book" with properties such as "title", "author", and "publisher". Implement the necessary getter and setter methods for each property.

class Book {
    private String title;
    private String author;
    private String publisher;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
}

public class Q5 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setAuthor("Kishor");
        b.setPublisher("RIT");

        System.out.println(b.getTitle() + " by " + b.getAuthor() +
                ", published by " + b.getPublisher());
    }
}