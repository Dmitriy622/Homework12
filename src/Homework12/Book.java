package Homework12;

import java.util.Objects;

public class Book {
    private final String title;
    private int publishingYear;
    private final Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


    // Сокращаем код, чтобы быстрее выводить информацию по книге
//    public String getAutorFullName() {
//        return author.getName() + " " + author.getSurname();
//    }

    //Сокращаем с помощью toString
    public String toString() {
        return getTitle() + " " + getPublishingYear() + " " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, author);
    }
}
