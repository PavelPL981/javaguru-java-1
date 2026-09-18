package lesson_3.hw3.level_3;

public class Book {

    private String titleOfBook;
    private String author;
    private int yearOfPublication;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String titleOfBook, int yearOfPublication, String author, Chapter chapter1, Chapter chapter2) {
        this.titleOfBook = titleOfBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public void setChapter1(Chapter chapter1) {
        this.chapter1 = chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }

    public void setChapter2(Chapter chapter2) {
        this.chapter2 = chapter2;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", chapter1=" + chapter1 +
                ", chapter2=" + chapter2 +
                '}';
    }
}
