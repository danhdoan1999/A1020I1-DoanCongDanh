package controller;

import model.bean.Building;
import model.service.BuildingService;
import model.service.BuildingServiceIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "TComplexServlet",urlPatterns = {"","/tcomplex"})
public class TComplexServlet extends HttpServlet {
    private BuildingService buildingService;
    public void init(){
        buildingService = new BuildingServiceIml();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                addNewBuilding(request,response);
                break;
            default:

                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                addNewBuildingForm(request,response);
                break;
            default:
                try {
                    listBuilding(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }

    private void addNewBuildingForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.sendRedirect("pages/create.jsp");
    }


    private void listBuilding(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    List<Building> buildingList = this.buildingService.selectAllBuilding();
    request.setAttribute("buildingList",buildingList);
    request.getRequestDispatcher("pages/list.jsp").forward(request,response);
    }

    private void addNewBuilding(HttpServletRequest request, HttpServletResponse response) {
        String Id = request.getParameter("inputId");
        String status = request.getParameter("inputStatus");

    }

}
