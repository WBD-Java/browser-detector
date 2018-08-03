import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BrowserDetectorServlet", urlPatterns = "/browser")
public class BrowserDetectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getHeader("User-Agent");
        String browser = null;
        if (agent.contains("FireFox")) {
            browser = "Mozila FireFox";
        } else if (agent.contains("Chrome")) {
            browser = "Google Chrome";
        } else if (agent.contains("OPR")) {
            browser = "Opera";
        } else if (agent.contains("Safari")) {
            browser = "Apple Safari";
        }


        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Browser Dectector</h1>");
        writer.println("<h2>Your User-Agent is:" + agent + "</h2>");
        writer.println("<h2>Your Browser is: " + browser + "</h2>");
    }
}
