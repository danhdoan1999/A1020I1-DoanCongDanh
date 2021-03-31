package case_study.furama_resort.models;

public abstract class Services {
    public String id;
    public String nameService;
    public int acreage;
    public int cost;
    public int quantity;
    public String dayRents;
    public Services(){}
    public Services(String id,String nameService, int acreage , int cost,int quantity,String dayRents){
        this.acreage = acreage;
        this.nameService = nameService;
        this.cost = cost;
        this.quantity = quantity;
        this.dayRents = dayRents;
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDayRents() {
        return dayRents;
    }

    public void setDayRents(String dayRents) {
        this.dayRents = dayRents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public abstract void showInfor();
}
