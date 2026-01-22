package oop;

public class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;
    private double percent;
    private static int totalBook;
    private static String belongsTo = "Vanier College";

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
        totalBook++;
    }

    public static int getTotalBook(){
        return totalBook;
    }
    public static String getBelongsTo() {
        return belongsTo;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 ) {
        this.price = price; }
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 1) {
            this.price = this.price * (1-percent);
        }
    }

    public void displayBookInfo() {
        System.out.println(title+ " " + author + " " + price + " " + percent);
    }

    public void borrowBook() {
        System.out.println(this.title + " is borrowed");
    }
    public void borrowBook(String borrower) {
        System.out.println(borrower + " borrowed " + this.title);
    }
    public void borrowBook(String borrower, int days) {
        System.out.println(borrower + " borrowed " + this.title + " for " + days + " days.");
    }
}
