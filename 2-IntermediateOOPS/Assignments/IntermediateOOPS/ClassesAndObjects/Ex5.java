class Book{
    private String title;
    private String author;
    private String publisher;

    String getTitle(){
        return title;
    }
    void setTitle(String title){
        this.title=title;
    }

    String getAuthor(){
        return author;
    }
    void setAuthor(String author){
        this.author=author;
    }

    String getPublisher(){
        return publisher;
    }
    void setPublisher(String publisher){
        this.publisher=publisher;
    }
}

public class Ex5{
    public static void main(String[] args){
        Book john=new Book();

        john.setTitle("Alice In Wonderland");
        john.setAuthor("Alice");
        john.setPublisher("MyBooks");

        String title=john.getTitle();
        String author=john.getAuthor();
        String publisher=john.getPublisher();
        
        System.out.println("Title : "+title+"\nAuthor : "+author+"\nPublisher : "+publisher);
    }
}