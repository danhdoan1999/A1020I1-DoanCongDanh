import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet" , urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double priceList = Integer.parseInt(request.getParameter("price"));
        double discountPercent = Integer.parseInt(request.getParameter("discount"));

        double discountAmount = priceList * discountPercent * 0.01;
        request.setAttribute("result",discountAmount);
        request.getRequestDispatcher("display-discount.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
