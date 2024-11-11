/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet for displaying Indianapolis 500 winners in an HTML table format.
 */
@WebServlet("/IndyWinnerSimpleSV")
public class IndyWinnerSimpleSV extends HttpServlet {
    private static final int RECORDS_PER_PAGE = 10;
    private IndyWinnerDAO indyWinnerDAO;

    /**
     * Initializes the servlet and prepares the DAO for database access.
     *
     * @throws ServletException If DAO initialization fails.
     */
    @Override
    public void init() throws ServletException {
        try {
            indyWinnerDAO = new IndyWinnerDAO();
        } catch (ClassNotFoundException e) {
            throw new ServletException("Failed to load JDBC driver", e);
        }
    }

    /**
     * Handles HTTP GET requests to display a paginated list of winners.
     *
     * @param request The HTTP request.
     * @param response The HTTP response.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an I/O error occurs.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        int page = 1;
        String pageParam = request.getParameter("page");
        if (pageParam != null) {
            page = Integer.parseInt(pageParam);
        }
        int offset = (page - 1) * RECORDS_PER_PAGE;

        try {
            List<IndyWinner> winners = indyWinnerDAO.getWinners(RECORDS_PER_PAGE, offset);
            generateHTML(response, winners, page);
        } catch (SQLException e) {
            throw new ServletException("Database error", e);
        }
    }

    /**
     * Generates HTML output for the list of Indy 500 winners.
     *
     * @param response The HTTP response.
     * @param winners The list of IndyWinner instances to display.
     * @param currentPage The current page number for pagination.
     * @throws IOException If an I/O error occurs.
     */
    private void generateHTML(HttpServletResponse response, List<IndyWinner> winners, int currentPage)
            throws IOException {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Indy 500 Winners</title></head><body>");
        html.append("<h2>Indianapolis 500 Winners</h2>");
        html.append("<table border='1'>");
        html.append("<tr><th>Year</th><th>Driver</th><th>Average Speed</th><th>Country</th></tr>");

        for (IndyWinner winner : winners) {
            html.append("<tr>")
                .append("<td>").append(winner.getYear()).append("</td>")
                .append("<td>").append(winner.getDriver()).append("</td>")
                .append("<td>").append(winner.getAverageSpeed()).append("</td>")
                .append("<td>").append(winner.getCountry()).append("</td>")
                .append("</tr>");
        }

        html.append("</table>");

        // Pagination controls
        html.append("<div>");
        if (currentPage > 1) {
            html.append("<a href='?page=").append(currentPage - 1).append("'>Previous</a> ");
        }
        html.append("<a href='?page=").append(currentPage + 1).append("'>Next</a>");
        html.append("</div>");

        html.append("</body></html>");
        response.getWriter().write(html.toString());
    }
}