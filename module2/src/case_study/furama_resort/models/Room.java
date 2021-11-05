package case_study.furama_resort.models;

public class Room extends  Services{
    public String freeService;
    public  Room(){}
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, int acreage, int cost, int quantity, String dayRents, String freeService) {
        super(id, nameService, acreage, cost, quantity, dayRents);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "\n\tId : " + getId() +
                "\n\tTên dịch vụ : " + getNameService() +
                "\n\tDiện tích sử dụng : " + getAcreage() +
                "\n\tChi phí thuê : " + getCost() +
                "\n\tSố lượng người tối đa : " + getQuantity() +
                "\n\tKiểu thuê : " + getDayRents() +
                "\n\tDịch vụ miễn phí đi kèm : " + getFreeService();

    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
