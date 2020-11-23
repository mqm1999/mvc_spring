package Model.DAO;

import Helper.DatabaseUtil;
import Model.DTO.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    Scanner sc = new Scanner(System.in);
    DatabaseUtil databaseUtil = new DatabaseUtil();
    ArrayList<Book> listBook = new ArrayList<>();

    public ArrayList<Book> getAllBooks() throws SQLException {
        String sql = "select * from Book;";
        ResultSet rs = databaseUtil.executeQuery(sql);
        while (rs.next()) {
            Book temp = new Book();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("name"));
            temp.setAmount(rs.getInt("amount"));
            temp.setAuthor(rs.getString("author"));
            temp.setCategory(rs.getString("category"));
            temp.setStatus(rs.getBoolean("status"));
            listBook.add(temp);
        }
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i));
        }
        return listBook;
    }

    public boolean addBook(Book newBook) {
        String name = newBook.getName();
        String author = newBook.getAuthor();
        String category = newBook.getCategory();
        int amount = newBook.getAmount();
        String sqlCheck = "select * from Book where name = " + name + ";";
        String sql = "insert into Book (name, author, category, amount) values (" + name + ", " + author + ", " + category + ", " + amount + ");";
        try {
            ResultSet rs = databaseUtil.executeQuery(sqlCheck);
            if (rs.next() == false) {
                databaseUtil.updateQuery(sql);
                System.out.println("Success");
                return true;
            } else {
                System.out.println("Fail");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        } finally {

        }

    }

}

// int char 