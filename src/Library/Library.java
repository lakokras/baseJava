package Library;


import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Добавлена книга: " + book);
    }
    public void removeBook(Book book) {
        if (this.books.remove(book)) {
            System.out.println("Удалена книга: " + book);
        } else {
            System.out.println("Книга не найдена: " + book);
        }
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Этой книги нет в библиотеке");
        } else {
            System.out.println("Книги в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
