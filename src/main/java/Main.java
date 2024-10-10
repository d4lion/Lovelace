import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Testing", "postgres", "d4lion" +
                "#031");

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM personas")){
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
