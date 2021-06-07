package model.service;

import model.bean.Building;
import model.repository.BuildingRepository;
import model.repository.BuildingRepositoryIml;

import java.sql.SQLException;
import java.util.List;

public class BuildingServiceIml implements BuildingService {
    private BuildingRepository buildingRepository = new BuildingRepositoryIml();
    @Override
    public List<Building> selectAllBuilding() throws SQLException {
        return buildingRepository.selectAllBuilding();
    }

    @Override
    public void insertBuilding(Building building) throws SQLException {

    }

    @Override
    public boolean deleteBuilding(String id) throws SQLException {
        return false;
    }

    @Override
    public Building getBuildingById(String id) throws SQLException {
        return null;
    }
}
