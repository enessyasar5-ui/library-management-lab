public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addbook(new Book("Clean Code", "Robert C. Martin", 101));
        library.addbook(new Book("Design Patterns", "GoF", 202));
        library.addbook(new Book("The Pragmatic Programmer", "Hunt and Thomas", 303));

        System.out.println("Available books:");
        library.listL();

        library.barrowb(202);

        System.out.println("\nBorrowed books:");
        library.ListO();

        library.returnb(202);

        System.out.println("\nAvailable books after return:");
        library.listL();
    }
}
