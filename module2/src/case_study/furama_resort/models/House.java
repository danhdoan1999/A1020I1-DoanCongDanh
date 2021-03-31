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

    public House(String id, String nameService, int acreage, int cost, int quantity, String dayRents, String typeRoom, String moreService, int floor) {
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
    public String toString() {
        return "\n\tId: " + getId() +
                "\n\tTên dịch vụ : " + getNameService() +
                "\n\tDiện tích sử dụng : " + getAcreage() +
                "\n\tChi phí thuê : " + getCost() +
                "\n\tSố lượng người tối đa : " + getQuantity() +
                "\n\tKiểu thuê : " + getDayRents() +
                "\n\tTiêu chuẩn phòng : " + getTypeRoom() +
                "\n\tMô tả tiện nghi khác : " + getMoreService() +
                "\n\tSố tầng : " + getFloor();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
