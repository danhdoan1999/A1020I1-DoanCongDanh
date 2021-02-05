package case_study.furama_resort.models;

public class Room extends  Services{
    public String freeService;
    public  Room(){}
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, int acreage, double cost, int quantity, String dayRents, String freeService) {
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
    public void showInfor() {
        System.out.println("Villa : " +
                ", id='" + getId() + '\'' +
                ", nameService='" + getNameService() + '\'' +
                ", acreage=" + getAcreage() +
                ", cost=" + getCost() +
                ", quantity=" + getQuantity() +
                ", dayRents='" + getDayRents());
    }
}
