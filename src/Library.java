import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> lbooks = new ArrayList<>();

    public boolean addbook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book.");
            return false;
        }
        if (findBook(book.getIsbn()) != null) {
            System.out.println("A book with ISBN " + book.getIsbn() + " already exists.");
            return false;
        }
        lbooks.add(book);
        System.out.println("Book added: " + book.getTitle());
        return true;
    }

    public void barrowb(int isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }
        book.setAvailable(false);
        System.out.println("Book borrowed: " + book.getTitle());
    }

    public void returnb(int isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.isAvailable()) {
            System.out.println("Book is already in the library.");
            return;
        }
        book.setAvailable(true);
        System.out.println("Book returned: " + book.getTitle());
    }

    public void listL() {
        boolean found = false;
        for (Book book : lbooks) {
            if (book.isAvailable()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books.");
        }
    }

    public void ListO() {
        boolean found = false;
        for (Book book : lbooks) {
            if (!book.isAvailable()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No borrowed books.");
        }
    }

    private Book findBook(int isbn) {
        for (Book book : lbooks) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
}
