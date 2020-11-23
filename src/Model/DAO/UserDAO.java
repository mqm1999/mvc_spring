package Model.DAO;

import Helper.DatabaseUtil;
import Model.DTO.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDAO {
    Scanner sc = new Scanner(System.in);
    DatabaseUtil databaseUtil = new DatabaseUtil();
    ArrayList<User> listUser = new ArrayList<>();

    public ArrayList<User> getAllUsers() throws SQLException {
        String sql = "select * from User;";
        ResultSet rs = databaseUtil.executeQuery(sql);
        while(rs.next()) {
            User temp = new User();
            temp.setId(rs.getInt("id"));
            temp.setUsername(rs.getString("username"));
            temp.setPassword(rs.getString("password"));
            temp.setRole(rs.getString("role"));
            temp.setStatus(rs.getBoolean("status"));
            listUser.add(temp);
        }
        for (int i = 0; i < listUser.size(); i++) {
            System.out.println(listUser.get(i));
        }
        return listUser;
    }
}
