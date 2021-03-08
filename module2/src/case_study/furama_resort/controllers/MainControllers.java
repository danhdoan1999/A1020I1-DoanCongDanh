package case_study.furama_resort.controllers;

import case_study.furama_resort.commons.InputOutput;
import case_study.furama_resort.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainControllers {
    public static final String COMMA = ",";

    public static final String FILE_NAME_VILLA = "D:\\Baitapp\\hocweb\\Codegym\\A1020I1-DoanCongDanh\\module2\\src\\case_study\\furama_resort\\data\\Villa.csv";
    public static final String FILE_NAME_HOUSE = "D:\\Baitapp\\hocweb\\Codegym\\A1020I1-DoanCongDanh\\module2\\src\\case_study\\furama_resort\\data\\House.csv";
    public static final String FILE_NAME_ROOM = "D:\\Baitapp\\hocweb\\Codegym\\A1020I1-DoanCongDanh\\module2\\src\\case_study\\furama_resort\\data\\Room.csv";
    public static final String FILE_NAME_CUSTOMER = "src\\case_study\\furama_resort\\data\\Room.csv";
    public static void addNewServices(){
        // https://levunguyen.com/laptrinhjava/2020/02/07/xu-li-file-trong-lap-trinh-java/
        Scanner scanner = new Scanner(System.in);
        int chosseService;
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            chosseService = scanner.nextInt();
            switch (chosseService){
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

    }

    private static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("Nhap id House: ");
        house.setId(scanner.nextLine());

        System.out.println("Nhap ten House ");
        house.setNameService(scanner.nextLine());
        System.out.println("Nhap dien tich su dung ");
        house.setAcreage(scanner.nextInt());
        System.out.println("Nhap gia thue ");
        house.setCost(scanner.nextDouble());
        System.out.println("Nhap so luong nguoi toi da ");
        house.setQuantity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap kieu thue theo nam thang ngay gio ");
        house.setDayRents(scanner.nextLine());
        System.out.println("Nhap tieu chuan phong ");
        house.setTypeRoom(scanner.nextLine());
        System.out.println("Nhap mo ta tien nghi ");
        house.setMoreService(scanner.nextLine());
        System.out.println("Nhap so tang ");
        house.setFloor(scanner.nextInt());
        listHouse.add(house);
        String line = "";
        for (House h: listHouse) {
            line = " id : " + h.getId() + COMMA + " Ten dich vu : " + h.getNameService() + COMMA +" Dien tich : "+ h.getAcreage()
                    + COMMA +" Gia thue : "+ h.getCost() + COMMA +" So luong nguoi : "+ h.getQuantity() + COMMA +" Kieu thue : "+ h.getDayRents()
                    + COMMA +" Tieu chuan phong : "+ h.getTypeRoom() + COMMA +" Tien nghi : "+ h.getMoreService()
                    + COMMA +" So tang : "+ h.getFloor();
            InputOutput.writeFile(FILE_NAME_HOUSE,line);
        }
    }
    static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    static ArrayList<Room> listRoom = new ArrayList<Room>();
    static ArrayList<House> listHouse = new ArrayList<House>();
    static ArrayList<Customer> listCustomer = new ArrayList<>();
    private static void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("Nhap id Villa : ");
        villa.setId(scanner.nextLine());
        System.out.println("Nhap ten Villa");
        villa.setNameService(scanner.nextLine());
        System.out.println("Nhap dien tich su dung ");
        villa.setAcreage(scanner.nextInt());
        System.out.println("Nhap gia thue ");
        villa.setCost(scanner.nextDouble());
        System.out.println("Nhap so luong nguoi toi da ");
        villa.setQuantity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap kieu thue theo nam thang ngay gio ");
        villa.setDayRents(scanner.nextLine());
        System.out.println("Nhap tieu chuan phong ");
        villa.setTypeRoom(scanner.nextLine());
        System.out.println("Nhap mo ta tien nghi ");
        villa.setMoreService(scanner.nextLine());
        System.out.println("Nhap dien tich ho boi ");
        villa.setPoolArea(scanner.nextDouble());
        System.out.println("Nhap so tang ");
        villa.setFloor(scanner.nextInt());
        listVilla.add(villa);
        String line = "";
        for (Villa vl: listVilla) {
            line = " id : " + vl.getId() + COMMA + " Ten dich vu : " + vl.getNameService() + COMMA +" Dien tich : "+ vl.getAcreage()
                    + COMMA +" Gia thue : "+ vl.getCost() + COMMA +" So luong nguoi : "+ vl.getQuantity() + COMMA +" Kieu thue : "+ vl.getDayRents()
                    + COMMA +" Tieu chuan phong : "+ vl.getTypeRoom() + COMMA +" Tien nghi : "+ vl.getMoreService() + COMMA +" Ho Boi : "+ vl.getPoolArea()
                    + COMMA +" So tang : "+ vl.getFloor();
            InputOutput.writeFile(FILE_NAME_VILLA,line);
        }
    }

    private static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Nhap ho va ten khach hang : ");
        customer.setHoTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh ");
        customer.setDateBirth(scanner.nextLine());
        System.out.println("Nhap gioi tinh ");
        customer.setGender(scanner.nextLine());
        System.out.println("Nhap CMND ");
        customer.setIdCustomer(scanner.nextDouble());
        System.out.println("Nhap so ĐT ");
        customer.setPhone(scanner.nextDouble());
        System.out.println("Nhap email ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Nhap loai khach ");
        customer.setMember(scanner.nextLine());
        System.out.println("Nhap dia chi khach hang ");
        customer.setAddress(scanner.nextLine());
        listCustomer.add(customer);
        String line = "";
        for (Customer cus: listCustomer) {
            line = " ten : " + cus.getHoTen() + COMMA + " Ten dich vu : " + cus.setAddress(); + COMMA +" Dien tich : "+ vl.getAcreage()
                    + COMMA +" Gia thue : "+ vl.getCost() + COMMA +" So luong nguoi : "+ vl.getQuantity() + COMMA +" Kieu thue : "+ vl.getDayRents()
                    + COMMA +" Tieu chuan phong : "+ vl.getTypeRoom() + COMMA +" Tien nghi : "+ vl.getMoreService() + COMMA +" Ho Boi : "+ vl.getPoolArea()
                    + COMMA +" So tang : "+ vl.getFloor();
            InputOutput.writeFile(FILE_NAME_VILLA,line);
        }
    }

    private static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Nhap id Room: ");
        room.setId(scanner.nextLine());
        System.out.println("Nhap ten Room");
        room.setNameService(scanner.nextLine());
        System.out.println("Nhap dien tich su dung ");
        room.setAcreage(scanner.nextInt());
        System.out.println("Nhap gia thue ");
        room.setCost(scanner.nextDouble());
        System.out.println("Nhap so luong nguoi toi da ");
        room.setQuantity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap kieu thue theo nam thang ngay gio ");
        room.setDayRents(scanner.nextLine());
        System.out.println("Nhap dich vu mien phi di kem ");
        room.setFreeService(scanner.nextLine());
        listRoom.add(room);
        String line = "";
        for (Room r: listRoom) {
            line = " id : " + r.getId() + COMMA + " Ten dich vu : " + r.getNameService() + COMMA +" Dien tich : "+ r.getAcreage()
                    + COMMA +" Gia thue : "+ r.getCost() + COMMA +" So luong nguoi : "+ r.getQuantity() + COMMA +" Kieu thue : "+ r.getDayRents()
                    + COMMA +" Dich vu mien phi : "+ r.getFreeService();
            InputOutput.writeFile(FILE_NAME_ROOM,line);
        }
    }

    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int section;
        do {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
             section = scanner.nextInt();
            switch (section) {
                case 1:
                    MainControllers.addNewServices();
                    break;
                case 2:
                    MainControllers.showServices();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while (section != 0);
    }

    private static void showServices() {
        Scanner scanner = new Scanner(System.in);
        int showServices;
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Room Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        showServices = scanner.nextInt();
        switch (showServices){
            case 1:
//                for (Villa vl : listVilla ){
//                    vl.showInfor();
//                }
                List<String> listlineVilla = InputOutput.readFile(FILE_NAME_VILLA);
                System.out.println(listlineVilla);
                break;
            case 2:
//                for (House h : listHouse){
//                    h.showInfor();
//                }
                List<String> listlineHouse = InputOutput.readFile(FILE_NAME_HOUSE);
                System.out.println(listlineHouse);
                break;
            case 3:
//                for (Room r : listRoom){
//                    r.showInfor();
//                }
                List<String> listlineRoom = InputOutput.readFile(FILE_NAME_ROOM);
                System.out.println(listlineRoom);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();

//        List<Services> servicesList = new ArrayList<>();
//        House house1 = new House();
//        Villa villa1 = new Villa();
//        Room room1 = new Room();
//        servicesList.add(house1);
//        servicesList.add(villa1);
//        servicesList.add(house1);
//
//
//
//        for (Services services: servicesList) {
//            if (services instanceof House) {
//                House house = (House) services;
//            }
//        }
//
//        for (Services services: servicesList) {
//            services.showInfor();
//        }
    }
}
