package com.sena.edu;

import java.util.Scanner;
import com.sena.edu.entitis.libreria;

public class Main {
    public static void main(String[] args) {
        libreria library = new libreria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add book");
            System.out.println("2. Search book");
            System.out.println("3. Display all books");
            System.out.println("4. Lend book");
            System.out.println("5. Return book");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.next();
                    System.out.print("Enter book author: ");
                    String author = scanner.next();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.next();
                    System.out.print("Enter book year: ");
                    int year = scanner.nextInt();
                    library.addBook(title, author, isbn, year, false);
                    break;
                case 2:
                    System.out.print("Enter search query: ");
                    String query = scanner.next();
                    library.searchBook(query);
                    break;
                case 3:
                    library.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter book title to lend: ");
                    String lendTitle = scanner.next();
                    library.lendBook(lendTitle);
                    break;
                case 5:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.next();
                    library.returnBook(returnTitle);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
