package com.company;

import java.util.List;
import java.util.Objects;

public class Writer extends Person{
    public Genre genre;
    public Publishers publishers;
    public List<Book> books;
    public String phone;
    public String email;
    public Agent agent;

    public Writer() {
    }

    public Writer(Genre genre, Publishers publishers, List<Book> books, String phone, String email, Agent agent) {
        this.genre = genre;
        this.publishers = publishers;
        this.books = books;
        this.phone = phone;
        this.email = email;
        this.agent = agent;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publishers getPublishers() {
        return publishers;
    }

    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "genre=" + genre +
                ", publishers=" + publishers +
                ", books=" + books +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", agent=" + agent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Writer)) return false;
        Writer writer = (Writer) o;
        return getGenre() == writer.getGenre() &&
                getPublishers() == writer.getPublishers() &&
                Objects.equals(getBooks(), writer.getBooks()) &&
                Objects.equals(getPhone(), writer.getPhone()) &&
                Objects.equals(getEmail(), writer.getEmail()) &&
                Objects.equals(getAgent(), writer.getAgent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGenre(), getPublishers(), getBooks(), getPhone(), getEmail(), getAgent());
    }
}


