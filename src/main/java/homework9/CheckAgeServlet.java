package homework9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/checkAge")
public class CheckAgeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int age = Integer.parseInt(request.getParameter("age"));
        boolean isAdult = age >= 18;

        request.setAttribute("isAdult", isAdult);
        request.getRequestDispatcher("/check.jsp").forward(request, response);
    }
}