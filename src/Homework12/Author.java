package Homework12;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return name +" " + surname; //делигирование
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //Сравнение авторов:
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Author author = (Author) o;
        return author.name.equals(name) && author.surname.equals(surname);
    }


}
