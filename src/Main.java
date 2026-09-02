import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, backend!");

        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("Animal Farm", "George Orwell", 112);
        Book book4 = new Book("Dune", "Frank Herbert", 412);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book book : books) {
            System.out.println(book.describe());
        }

        int count = 0;

        for (Book book : books) {
            if (book.getPages() > 300) {
                count++;
            }
        }

        System.out.println("Books with more than 300 pages: " + count);

        
        Map<String, Integer> stock = new HashMap<>();

        stock.put("1984", 5);
        stock.put("The Hobbit", 3);
        stock.put("Animal Farm", 7);
        stock.put("Dune", 4);

        System.out.println("Copies of Dune: " + stock.get("Dune"));

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int total = 0;

        for (int copies : stock.values()) {
            total += copies;
        }

        System.out.println("Total copies: " + total);
    }
}
