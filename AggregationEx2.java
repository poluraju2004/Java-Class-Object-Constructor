package constructsprograms;

/*10.Implement a Java program that models a Library. Create classes for
Library, Book, and Author. Ensure that the Library class aggregates a
collection of Book objects, and each Book object has an aggregation
relationship with an Author object.*/

// Author class
class Author {
    private String name;
    private String country;

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void displayAuthor() {
        System.out.println("Author: " + name);
        System.out.println("Country: " + country);
    }
}

// Book class
class Book {
    private int bookId;
    private String title;
    private Author author; // Aggregation

    public Book(int bookId, String title, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        author.displayAuthor();
    }
}

// Library class
class Library {
    private String libraryName;
    private Book book1;
    private Book book2;

    // Aggregation: Library receives existing Book objects
    public Library(String libraryName, Book book1, Book book2) {
        this.libraryName = libraryName;
        this.book1 = book1;
        this.book2 = book2;
    }

    public void displayLibrary() {
        System.out.println("Library: " + libraryName);

        System.out.println("\n--- Book 1 ---");
        book1.displayBook();

        System.out.println("\n--- Book 2 ---");
        book2.displayBook();
    }
}

// Main class
public class AggregationEx2 {
    public static void main(String[] args) {

        // Create Author objects independently
        Author a1 = new Author("R. K. Narayan", "India");
        Author a2 = new Author("James Clear", "USA");

        // Create Book objects using existing Author objects
        Book b1 = new Book(101, "Malgudi Days", a1);
        Book b2 = new Book(102, "Atomic Habits", a2);

        // Pass existing Book objects to Library
        Library library = new Library("Central Library", b1, b2);

        // Display details
        library.displayLibrary();
    }
}

 



	