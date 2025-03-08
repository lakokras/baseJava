package Library;

public class Program {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Поджопник", "Чья-то мать", 2022));
        library.displayBooks();
        library.removeBook(new Book("Профессиональный отсос", "Айзат", 2025));
    }
}
