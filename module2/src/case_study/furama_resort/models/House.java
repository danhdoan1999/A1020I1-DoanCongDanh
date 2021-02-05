package case_study.furama_resort.models;

public class House extends  Services{
    public String typeRoom;
    public String moreService;
    public int floor;

    public House(){}
    public House(String typeRoom, String moreService, int floor) {
        this.typeRoom = typeRoom;
        this.moreService = moreService;
        this.floor = floor;
    }

    public House(String id, String nameService, int acreage, double cost, int quantity, String dayRents, String typeRoom, String moreService, int floor) {
        super(id, nameService, acreage, cost, quantity, dayRents);
        this.typeRoom = typeRoom;
        this.moreService = moreService;
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
                ", floor=" + getFloor() +
                ", acreage=" + getAcreage() +
                ", cost=" + getCost() +
                ", quantity=" + getQuantity() +
                ", dayRents='" + getDayRents());
    }
}
