import java.io.Serial;
import java.io.Serializable;

public class Book  {
    private int  id;
    private String title;
    private String author;
    private int year;
    private static int idGen = 0;
    private boolean available;


    public void setId(boolean available) {
        idGen++;
    }
    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
        idGen++;
    }
    public Book(String title, String author, int year) {
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);
        available = true;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public void setYear(int year) {
        if (year < 0 || year > 2025) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        this.year = year;
    }
    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void markAsBorrowed() {
        this.available = false;
    }
    public void markAsReturned() {
        this.available = true;
    }
    public String toString() {
        return "Book{" +
                "title=" + title + '\'' +
                ", author=" + author + '\'' +
                ", year=" + year + '\'' +
                "available status=" + available + '}';
    }

}









//   разобраться с  this, classes, objects,setter,getter