package model.repository;

import model.bean.Building;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuildingRepositoryIml implements BuildingRepository {

    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Building> selectAllBuilding() throws SQLException {
        List<Building> buildingList = new ArrayList<>();
        CallableStatement callableStatement = this.baseRepository.getConnection().prepareCall("call building_list();");
        ResultSet resultSet = callableStatement.executeQuery();
        Building building = null;
        while (resultSet.next()){
            building = new Building();
            building.setIdMB(resultSet.getString("ma_mat_bang"));
            building.setStatus(resultSet.getString("trang_thai"));
            building.setAcreage(resultSet.getString("dien_tich"));
            building.setFloor(resultSet.getInt("so_tang"));
            building.setTypeBuilding(resultSet.getString("loai_mat_bang"));
            building.setCost(resultSet.getInt("gia_tien"));
            building.setDayBegin(resultSet.getString("ngay_bat_dau"));
            building.setDayEnd(resultSet.getString("ngay_ket_thuc"));

            buildingList.add(building);
        }
        return buildingList;
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
