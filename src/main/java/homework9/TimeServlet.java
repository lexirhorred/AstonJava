package homework9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(urlPatterns = {"/minsk", "/washington", "/beijing"})
public class TimeServlet extends HttpServlet {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        ZoneId zoneId;

        switch (path) {
            case "/minsk":
                zoneId = ZoneId.of("Europe/Moscow");
                break;
            case "/washington":
                zoneId = ZoneId.of("America/New_York");
                break;
            case "/beijing":
                zoneId = ZoneId.of("Asia/Shanghai");
                break;
            default:
                throw new ServletException("Invalid path");
        }

        ZonedDateTime currentTime = ZonedDateTime.now(zoneId);
        String formattedTime = currentTime.format(formatter);

        request.setAttribute("time", formattedTime);
        getServletContext().getRequestDispatcher("/time.jsp").forward(request, response);
    }
}