import View.BookView;
import View.UserView;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        BookView bookView = new BookView();
        UserView userView = new UserView();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Book, 2. User");
        int input = sc.nextInt();
        switch(input) {
            case 1: bookView.execute();

            case 2: userView.execute();

            default:
                System.out.println("Please select again");
        }
    }
}
