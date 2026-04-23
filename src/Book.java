public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean available=true;

    public Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }
    public boolean control(){
        if (!available){
            System.out.println("this book not available");
        }
        else{
            System.out.println("book added");
            available=false;
        }
        return available;
    }

    public void add(Book other){
     this.isbn=isbn;
     this.author=author;
     this.title=title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", available=" + available +
                '}';
    }
}
