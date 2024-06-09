import java.util.Scanner;
import java.util.ArrayList;

// Kelas abstrak Book
abstract class Book {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter dan Setter untuk title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter dan Setter untuk author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter dan Setter untuk year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method abstrak untuk menampilkan informasi buku
    public abstract void displayInfo();

    // Method displayInfo yang akan dioverride oleh subclass
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

// Kelas Fiction yang meng-extend Book
class Fiction extends Book {
    private String genre;

    // Constructor
    public Fiction(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    // Getter dan Setter untuk genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Overriding method displayInfo dari kelas Book
    @Override
    public void displayInfo() {
        System.out.println(toString() + ", Genre: " + genre);
    }

    // Overloading method displayInfo untuk menampilkan genre saja
    public void displayInfo(boolean showGenreOnly) {
        if (showGenreOnly) {
            System.out.println("Genre: " + genre);
        } else {
            displayInfo();
        }
    }
}

// Kelas NonFiction yang meng-extend Book
class NonFiction extends Book {
    private String field;

    // Constructor
    public NonFiction(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    // Getter dan Setter untuk field
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    // Overriding method displayInfo dari kelas Book
    @Override
    public void displayInfo() {
        System.out.println(toString() + ", Field: " + field);
    }
}

// Kelas Library untuk mengelola koleksi buku
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method untuk menambahkan buku ke koleksi
    public void addBook(Book book) {
        books.add(book);
    }

    // Method untuk menampilkan semua buku di perpustakaan
    public void showAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Berapa banyak buku yang ingin Anda tambahkan? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan jenis buku (Fiction/NonFiction): ");
            String type = scanner.nextLine();

            System.out.print("Masukkan judul buku: ");
            String title = scanner.nextLine();

            System.out.print("Masukkan penulis buku: ");
            String author = scanner.nextLine();

            System.out.print("Masukkan tahun terbit buku: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (type.equalsIgnoreCase("Fiction")) {
                System.out.print("Masukkan genre buku: ");
                String genre = scanner.nextLine();
                Fiction fictionBook = new Fiction(title, author, year, genre);
                library.addBook(fictionBook);
            } else if (type.equalsIgnoreCase("NonFiction")) {
                System.out.print("Masukkan bidang buku: ");
                String field = scanner.nextLine();
                NonFiction nonFictionBook = new NonFiction(title, author, year, field);
                library.addBook(nonFictionBook);
            } else {
                System.out.println("Jenis buku tidak dikenal.");
            }
        }

        System.out.println("\nSemua Buku di Perpustakaan:");
        library.showAllBooks();
    }
}
