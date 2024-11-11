/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 tests for the IndyWinnerDAO class.
 */
public class IndyWinnerDAOTest {

    private static IndyWinnerDAO indyWinnerDAO;

    /**
     * Initializes the DAO instance before running any tests.
     *
     * @throws ClassNotFoundException if the JDBC driver is not found.
     */
    @BeforeClass
    public static void setUp() throws ClassNotFoundException {
        indyWinnerDAO = new IndyWinnerDAO();
    }

    /**
     * Tests if the getWinners method returns the correct number of winners and
     * checks the validity of the returned data.
     */
    @Test
    public void testGetWinners() {
        try {
            int limit = 5;
            int offset = 0;

            List<IndyWinner> winners = indyWinnerDAO.getWinners(limit, offset);

            assertNotNull("The winners list should not be null", winners);
            assertEquals("The size of winners list should be equal to the limit", limit, winners.size());

            // Validate the fields of the first record
            IndyWinner firstWinner = winners.get(0);
            assertNotNull("Driver name should not be null", firstWinner.getDriver());
            assertTrue("Average speed should be greater than 0", firstWinner.getAverageSpeed() > 0);
            assertNotNull("Country should not be null", firstWinner.getCountry());
        } catch (SQLException e) {
            fail("SQL Exception occurred: " + e.getMessage());
        }
    }

    /**
     * Tests if the getWinners method handles an out-of-range offset properly by
     * returning an empty list.
     */
    @Test
    public void testEmptyResult() {
        try {
            int limit = 5;
            int offset = 10000; // Assume this offset is beyond the total record count

            List<IndyWinner> winners = indyWinnerDAO.getWinners(limit, offset);

            assertNotNull("The winners list should not be null even if no results", winners);
            assertTrue("The winners list should be empty", winners.isEmpty());
        } catch (SQLException e) {
            fail("SQL Exception occurred: " + e.getMessage());
        }
    }

    /**
     * Cleans up the DAO instance after all tests are completed.
     */
    @AfterClass
    public static void tearDown() {
        indyWinnerDAO = null;
    }
}