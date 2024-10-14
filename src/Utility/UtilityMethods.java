package Utility;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilityMethods {

    public static void createConnection(String url,
                                        String username,
                                        String password)
            throws SQLException {
        CustomVariables.connection=
                DriverManager.getConnection(url,username,password);
        System.out.println("Db connected");
    }
}
