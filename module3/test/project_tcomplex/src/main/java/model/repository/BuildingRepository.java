package model.repository;

import model.bean.Building;

import java.sql.SQLException;
import java.util.List;

public interface BuildingRepository {
    List<Building> selectAllBuilding() throws SQLException;
    void insertBuilding(Building building) throws SQLException;
    boolean deleteBuilding(String id)throws SQLException;
    Building getBuildingById(String id) throws SQLException;
}
