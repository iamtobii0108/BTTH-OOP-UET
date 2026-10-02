package Bai2_5;
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Lập trình Java", "John", 150.0);
        Book b2 = new Book("Lập trình Java", "John", 150.0);
        System.out.println("So sánh bằng == : " + (b1 == b2));
        System.out.println("So sánh bằng equals(): " + b1.equals(b2));
    }
}
