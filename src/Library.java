import java.util.HashSet;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("B0001", "Tác giả 1", "Tiêu đề 1", 2000);
        Book book2 = new Book("B0001", "Tác giả 2", "Tiêu đề 2", 2002);

        Set<Book> books = new HashSet<Book>();

        books.add(book1);
        books.add(book2);

        System.out.println(books);
    }
}
