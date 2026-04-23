import java.util.ArrayList;
public class Library {
    ArrayList<Book> lbooks = new ArrayList<>();

    public void addbook(Book book) {
        lbooks.add(book);

    }

    public void barrowb(int Isbn) {
        for (int i = 0; i < lbooks.size(); i++) {
            if (lbooks.get(i).getIsbn() == Isbn && lbooks.get(i).isAvailable()) {
                lbooks.get(i).setAvailable(false);
            }else if(i== lbooks.size() && lbooks.get(i).isAvailable() ) {
                System.out.println("this book not avaliable");
            }
        }
    }

    public void returnb(int Isbn) {
        for (int i = 0; i < lbooks.size(); i++) {
            if (lbooks.get(i).getIsbn() == Isbn) {
                lbooks.get(i).setAvailable(true);
                System.out.println("you returned a book");
                break;
            } else if (i== lbooks.size() && lbooks.get(i).isAvailable() ){
                System.out.println("you dont have this book which is isbn number " + Isbn);
            }

        }
    }


    public void listL() {
        for (int i = 0; i < lbooks.size(); i++) {
            if (lbooks.get(i).isAvailable()) {
                System.out.println(lbooks.get(i).toString());
            }
        }
    }

    public void ListO() {
        for (int i = 0; i < lbooks.size(); i++) {
            if (!lbooks.get(i).isAvailable()) {
                System.out.println(lbooks.get(i).toString());
            }
        }
    }
}