package View;

import Controller.UserController;
import Model.DTO.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    UserController userController = UserController.getInstance();
    Scanner sc = new Scanner(System.in);

    public void execute() throws SQLException {
        while(true) {
            System.out.println("Select option: 1. Show");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    ArrayList<User> listUser = userController.getAllUsers();
                    for (int i = 0; i < listUser.size(); i++) {
                        System.out.println(listUser.get(i).toString());
                    }
                    break;
            }
        }
    }
}
