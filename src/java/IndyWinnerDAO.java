/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Data Access Object (DAO) for retrieving Indianapolis 500 winners from the database.
 * 
 * @author han
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IndyWinnerDAO {
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionURL = "jdbc:mysql://localhost:3306/INDYWINNERS";
    private final String user = "root";
    private final String pass = "Aa880911";
   
    /**
     * Initializes the DAO and loads the JDBC driver.
     *
     * @throws ClassNotFoundException If the JDBC driver is not found.
     */
    public IndyWinnerDAO() throws ClassNotFoundException {
        Class.forName(driverName);
    }

    /**
     * Retrieves a list of IndyWinner objects, ordered by year in descending order.
     *
     * @param limit The maximum number of records to retrieve.
     * @param offset The starting point in the result set.
     * @return A list of IndyWinner instances.
     * @throws SQLException If a database access error occurs.
     */
    public List<IndyWinner> getWinners(int limit, int offset) throws SQLException {
        List<IndyWinner> winners = new ArrayList<>();
        String query = "SELECT YEAR, DRIVER, AVERAGESPEED, COUNTRY FROM INDYWINNERS ORDER BY YEAR DESC LIMIT ? OFFSET ?";

        try (Connection con = DriverManager.getConnection(connectionURL, user, pass);
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setInt(1, limit);
            stmt.setInt(2, offset);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    winners.add(new IndyWinner(
                        rs.getInt("YEAR"),
                        rs.getString("DRIVER"),
                        rs.getDouble("AVERAGESPEED"),
                        rs.getString("COUNTRY")
                    ));
                }
            }
        }
        return winners;
    }
}