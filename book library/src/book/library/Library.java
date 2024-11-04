/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.library;

/**
 *
 * @author Gcina.Ngxowa
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println( item.getTitle() + " has been added to the library.");
    }

    public void viewItems() {
        System.out.println("1 Viewing all library items...");
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            for (LibraryItem item : items) {
                item.displayDetails();
                System.out.println("-----");
            }
        }
    }

    public void start() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
       
            System.out.println("2. View All Items");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addBook();
             
                case 2 -> viewItems();
                case 3 -> {
                    System.out.println(" Exiting application...");
                    return;
                }
                default -> System.out.println("[ERROR] Invalid option. Try again.");
            }
        }
    }

    private void addBook() {
        System.out.println(" Adding a new book...");
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        addItem(new Book(id, title, author));
        System.out.println(" Book added successfully.");
    }

   
}