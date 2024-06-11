package com.sena.edu.entitis;

import java.util.ArrayList;
import java.util.List;

public class libreria {
    public List<libros> libros;

    public libreria() {
        libros = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn, int year, boolean stado) {
        libros newBook = new libros(title, author, year, isbn, true);
        libros.add(newBook);
        System.out.println("Book '" + title + "' added successfully!");
    }

    public void searchBook(String query) {
        List<libros> results = new ArrayList<>();
        for (libros book : libros) {
            if (book.getNombre().contains(query) || book.getAutor().contains(query)) {
                results.add(book);
            }
        }
        if (!results.isEmpty()) {
            System.out.println("Search results:");
            for (libros book : results) {
                System.out.println("Title: " + book.getNombre() + ", Author: " + book.getAutor() + ", ISBN: "
                        + book.getISBN() + ", Year: " + book.getAnioPublicacion());
            }
        } else {
            System.out.println("No books found.");
        }
    }

    public void displayAllBooks() {
        if (!libros.isEmpty()) {
            System.out.println("All books:");
            for (libros book : libros) {
                System.out.println("Title: " + book.getNombre() + ", Author: " + book.getAutor() + ", ISBN: "
                        + book.getISBN() + ", Year: " + book.getAnioPublicacion() + ",Estado  :" + book.isEstado());
            }
        } else {
            System.out.println("No books available.");
        }
    }

    public void lendBook(String title) {
        for (libros book : libros) {
            if (book.getNombre().equals(title) && book.isEstado()) {
                book.setEstado(false);
                System.out.println("Book '" + title + "' lent successfully!");
                return;
            }
        }
        System.out.println("Book not found or already lent.");
    }

    public void returnBook(String title) {
        for (libros book : libros) {
            if (book.getNombre().equals(title) && !book.isEstado()) {
                book.setEstado(true);
                System.out.println("Book '" + title + "' returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or already available.");
    }

}
