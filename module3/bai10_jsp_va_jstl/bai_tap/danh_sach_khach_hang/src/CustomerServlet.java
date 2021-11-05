import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" , urlPatterns = {"/","/customer"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Monkey D Luffy","1999-12-12","Da Nang","/image/luffy.jpg"));
        customerList.add(new Customer("Tony Chopper","2005-02-02","Ha Noi","/image/chopper.jpg"));
        customerList.add(new Customer("Shank","1992-01-08","Sai Gon","/image/shank.jpg"));
        customerList.add(new Customer("Nami","1999-05-30","Quang Tri","/image/nami.jpg"));
        customerList.add(new Customer("Sanji","1995-09-02","Hue","/image/sanji.jpg"));

        request.setAttribute("customerListServlet", customerList);
        request.getRequestDispatcher("/index1.jsp").forward(request,response);
    }
}
