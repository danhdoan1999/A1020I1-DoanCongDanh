package case_study.furama_resort.models;

public class Villa extends Services{
    public String typeRoom;
    public String moreService;
    public double poolArea;
    public int floor;
    public Villa(){}

    public Villa(String typeRoom, String moreService, double poolArea, int floor) {
        this.typeRoom = typeRoom;
        this.moreService = moreService;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id, String nameService, int acreage, double cost, int quantity, String dayRents, String typeRoom, String moreService, double poolArea, int floor) {
        super(id, nameService, acreage, cost, quantity, dayRents);
        this.typeRoom = typeRoom;
        this.moreService = moreService;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getMoreService() {
        return moreService;
    }

    public void setMoreService(String moreService) {
        this.moreService = moreService;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfor() {
        System.out.println("Villa : " +
                ", id='" + getId() + '\'' +
                ", nameService='" + getNameService() + '\'' +
                "typeRoom='" + getTypeRoom() + '\'' +
                ", moreService='" + getMoreService() + '\'' +
                ", poolArea=" + getPoolArea() +
                ", floor=" + getFloor() +
                ", acreage=" + getAcreage() +
                ", cost=" + getCost() +
                ", quantity=" + getQuantity() +
                ", dayRents='" + getDayRents());
    }
}
