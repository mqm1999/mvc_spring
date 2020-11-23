package Controller;

import Model.DAO.UserDAO;
import Model.DTO.User;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserController {
    UserDAO userDAO = new UserDAO();
    private static UserController instance;

    public static UserController getInstance() {
        if(instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    private UserController() {

    }


    public ArrayList<User> getAllUsers() throws SQLException{
        try {
            return userDAO.getAllUsers();
        } catch (SQLException e) {
            System.out.println("Failed");
            return null;
        }
    }
}
