package com.company;

import java.util.Objects;

public class Book {
    public String Name;
    public int countPage;
    public Genre genre;
    public String ISBN;

    public Book() {
    }

    public Book(String name, int countPage, Genre genre, String ISBN) {
        Name = name;
        this.countPage = countPage;
        this.genre = genre;
        this.ISBN = ISBN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", countPage=" + countPage +
                ", genre=" + genre +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getCountPage() == book.getCountPage() &&
                getName().equals(book.getName()) &&
                getGenre() == book.getGenre() &&
                getISBN().equals(book.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCountPage(), getGenre(), getISBN());
    }
}
