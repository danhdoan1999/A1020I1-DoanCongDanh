import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet" , urlPatterns = ("/translate"))
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String , String> dictionary = new HashMap<>();
        dictionary.put("Hello","Xin chao");
        dictionary.put("Like","Thich");
        dictionary.put("Goodbye","Tam biet");
        dictionary.put("Pay","Thanh toan");

        String search = request.getParameter("txtSearch");
        String result = dictionary.get(search);
        if(result != null){
            request.setAttribute("search","Word: " + search + "Result: " + result);
        } else request.setAttribute("search","Not found");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
