package case_study.furama_resort.models;

public class Villa extends Services{
    public String typeRoom;
    public String moreService;
    public int poolArea;
    public int floor;
    public Villa(){}

    public Villa(String typeRoom, String moreService, int poolArea, int floor) {
        this.typeRoom = typeRoom;
        this.moreService = moreService;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id, String nameService, int acreage, int cost, int quantity, String dayRents, String typeRoom, String moreService, int poolArea, int floor) {
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "\n\tId : " + getId() +
                "\n\tTên dịch vụ : " + getNameService() +
                "\n\tDiện tích sử dụng : " + getAcreage() +
                "\n\tChi phí thuê : " + getCost() +
                "\n\tSố lượng người tối đa : " + getQuantity() +
                "\n\tKiểu thuê : " + getDayRents() +
                "\n\tTiêu chuẩn phòng : " + getTypeRoom() +
                "\n\tMô tả tiện nghi khác : " + getMoreService() +
                "\n\tDiện tích hồ bơi : " + getPoolArea() +
                "\n\tSố tầng : " + getFloor();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
