import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculateServlet" , urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNum = Float.parseFloat(request.getParameter("firstNumber"));
        float secondNum = Float.parseFloat(request.getParameter("secondNumber"));
        char operator = request.getParameter("operator").charAt(0);

        float result = Calculate.calcutate(firstNum,secondNum,operator);

        try {
            request.setAttribute("result", "kết quả " + result);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }catch (Exception ex){
            request.setAttribute("result",ex.getMessage());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
