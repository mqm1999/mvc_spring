package View;

import Controller.BookController;
import Model.DTO.Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    BookController bookController = BookController.getInstance();
    Scanner sc = new Scanner(System.in);

    public void execute() throws SQLException {
        while(true) {
            System.out.println("Select option: 1: Show, 2. Add");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    ArrayList<Book> bookList = bookController.getAllBooks();
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Author: ");
                    String author = sc.next();
                    System.out.println("Category");
                    String category = sc.next();
                    System.out.println("Amount: ");
                    int amount = sc.nextInt();
                    Book newBook = new Book(name, author, category, amount);
                    boolean addBook = bookController.addBook(newBook);
                    if(addBook) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Failed to add");
                    }
            }
        }
    }
}
