import java.util.ArrayList;
import java.util.Scanner;


public class LibraryApp {
    public ArrayList<Book> books =  new ArrayList<Book>();
    Scanner input = new Scanner(System.in);
    Book book = new Book();

    static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.run();
    }

    public void run() {
        while (true) {
            System.out.println("Salamaleksus to our LibraryApp!!!");
            System.out.println("1. Print all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search book by title");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book by id");
            System.out.println("7. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    printAllBooks();
                    break;
                case 2:
                    addBook(book);
                    break;
                case 3:
                    searchBookByTitle();
                    break;
                case 4:
                    borrowBook(book);
                    break;
                case 5:
                    returnBook(book);
                    break;
                case 6:
                    deleteBook(book);
                    break;
                case 7:
                    exitTheApplication();
                    break;
                    default:
                        System.out.println("Invalid choice. Try again");

            }
        }
    }

    private void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library ;(");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    private void addBook(Book book) {
        System.out.print("Enter title: ");
        String title = input.nextLine();
        System.out.print("Enter author: ");
        String author = input.nextLine();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.nextLine();
        Book book1 = new Book(title, author, year);
        boolean add = books.add(book1);
        System.out.println("Book added, bro ;)");
    }

    private void saveBooks(ArrayList<Book> books) {
    }

    private void searchBookByTitle() {
        System.out.print("Enter title to search: ");
        String title = input.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found ;(");
        }
    }
    private void borrowBook(Book book) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        boolean found = false;
        for (Book book1 : books) {
            if (book1.getId() == id) {
                found = true;
                if (book1.isAvailable()) {
                    book1.markAsBorrowed();
                    System.out.println("You borrowed the book: " + book1.getTitle());
                } else {
                    System.out.println("The book is already borrowed.");
                }
                break;
            }

        }
        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
    public void returnBook(Book book) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        boolean found = false;
        for (Book book1 : books) {
            if (book1.getId() == id) {
                found = true;
                if (book1.isAvailable()) {
                    book1.markAsReturned();
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
    public void deleteBook(Book book) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        boolean found = false;
        for (Book book1 : books) {
            if (book1.getId() == id) {
                found = true;
                if (book1.isAvailable()) {
                    books.remove(book1);
                }
                break;
            }
        }if  (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
    public void exitTheApplication() {
        System.out.println("Thank you for using our library !!!");
        System.exit(0);
    }

}





