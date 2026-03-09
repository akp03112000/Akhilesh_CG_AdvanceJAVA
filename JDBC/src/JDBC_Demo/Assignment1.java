package JDBC_Demo;

import java.sql.*;
import java.util.Scanner;

public class Assignment1 {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "0311";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            while (true) {

                System.out.println("\n1.Insert");
                System.out.println("2.Display");
                System.out.println("3.Update");
                System.out.println("4.Delete");
                System.out.println("5.Exit");

                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        PreparedStatement ps =
                                con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");

                        System.out.print("ID: ");
                        ps.setInt(1, sc.nextInt());

                        sc.nextLine();
                        System.out.print("Name: ");
                        ps.setString(2, sc.nextLine());

                        System.out.print("Salary: ");
                        ps.setDouble(3, sc.nextDouble());

                        ps.executeUpdate();
                        System.out.println("Inserted");
                        break;

                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM employee");

                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " "
                                    + rs.getString(2) + " "
                                    + rs.getDouble(3));
                        }
                        break;

                    case 3:
                        PreparedStatement psu =
                                con.prepareStatement("UPDATE employee SET salary=? WHERE id=?");

                        System.out.print("ID: ");
                        psu.setInt(2, sc.nextInt());

                        System.out.print("New Salary: ");
                        psu.setDouble(1, sc.nextDouble());

                        psu.executeUpdate();
                        System.out.println("Updated");
                        break;

                    case 4:
                        PreparedStatement psd =
                                con.prepareStatement("DELETE FROM employee WHERE id=?");

                        System.out.print("ID: ");
                        psd.setInt(1, sc.nextInt());

                        psd.executeUpdate();
                        System.out.println("Deleted");
                        break;

                    case 5:
                        con.close();
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}