class Book {
    static String libraryName = "Central Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "ISBN123");
        Book b2 = new Book("Python", "Guido", "ISBN456");
        b1.display();
        b2.display();
        displayLibraryName();
    }
}
