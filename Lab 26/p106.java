class Book {

    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}


class BookPublication extends Book {

    private String title;

    BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("Book Publication: " + title);
    }
}


class PaperPublication extends Book {

    private String title;

    PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("Paper Publication: " + title);
    }
}


public class p106 {

    public static void main(String[] args) {

        String author = args[0];
        String title = args[1];
String title1 = args[2];

        Book b;

        b = new BookPublication(author, title);
        b.display();

        b = new PaperPublication(author, title1);
        b.display();
    }
}