package model.bean;

public class Building {
    private String idMB;
    private String status;
    private String acreage;
    private int floor;
    private String typeBuilding;
    private int cost;
    private String dayBegin;
    private String dayEnd;

    public Building() {
    }

    public Building(String idMB, String status, String acreage, int floor, String typeBuilding, int cost, String dayBegin, String dayEnd) {
        this.idMB = idMB;
        this.status = status;
        this.acreage = acreage;
        this.floor = floor;
        this.typeBuilding = typeBuilding;
        this.cost = cost;
        this.dayBegin = dayBegin;
        this.dayEnd = dayEnd;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getIdMB() {
        return idMB;
    }

    public void setIdMB(String idMB) {
        this.idMB = idMB;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getTypeBuilding() {
        return typeBuilding;
    }

    public void setTypeBuilding(String typeBuilding) {
        this.typeBuilding = typeBuilding;
    }

    public String getDayBegin() {
        return dayBegin;
    }

    public void setDayBegin(String dayBegin) {
        this.dayBegin = dayBegin;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
}
