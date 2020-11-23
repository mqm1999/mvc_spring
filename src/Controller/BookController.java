package Controller;

import Model.DAO.BookDAO;
import Model.DTO.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    BookDAO bookDAO = new BookDAO();

    private static BookController instance;

    public static BookController getInstance() {
        if(instance == null) {
            instance = new BookController();
        }
        return instance;
    }

    private BookController() {

    }

    public ArrayList<Book> getAllBooks() throws SQLException {
        try {
            return bookDAO.getAllBooks();
        } catch (Exception e) {
            System.out.println("Failed");
            return null;
        }
    }

    public boolean addBook(Book newBook) {
        try {
            return bookDAO.addBook(newBook);
        } catch (Exception e) {
            System.out.println("Failed");
            return false;
        }
    }
}
