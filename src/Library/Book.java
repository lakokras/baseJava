package Library;

import java.time.Year;

class Book extends Library {
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    @Override
    public String toString() {
        return "Книга = '" + title + "', Автор = " + author + ", Год = " + year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле 'книга' не может быть пустым");
        }
        this.title = title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле 'автор' не может быть пустым");
        }
        this.author = author.trim();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year < 0) {
            throw new IllegalArgumentException("Год не может быть отрицательным");
        }
        if (year > currentYear) {
            throw new IllegalArgumentException("Год не может больше текущего года: " + currentYear);
        }
        this.year = year;
    }
}