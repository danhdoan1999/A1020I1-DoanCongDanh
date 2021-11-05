package case_study.furama_resort.controllers;

import case_study.furama_resort.commons.InputOutput;
import case_study.furama_resort.models.*;

import java.util.*;

public class MainControllers {
    public static final String COMMA = ",";
    public static final String FILE_NAME_VILLA = "src\\case_study\\furama_resort\\data\\Villa.csv";
    public static final String FILE_NAME_HOUSE = "src\\case_study\\furama_resort\\data\\House.csv";
    public static final String FILE_NAME_ROOM = "src\\case_study\\furama_resort\\data\\Room.csv";
    public static final String FILE_NAME_CUSTOMER = "src\\case_study\\furama_resort\\data\\Customer.csv";
    public static final String FILE_NAME_EMPLOYEE = "src\\case_study\\furama_resort\\data\\Employee.csv";
    public static void displayMainMenu() {
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
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomers();
                    break;
                case 5:
                    break;
                case 6:
                    showInformationEmployee();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while (section != 0);
    }
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
    private static void addNewVilla() {
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();
        boolean checkValid = false;
        String regexID = "SVVL-[0-9]{4}";
        do{
            System.out.println("Nhap id Villa : ");
            String idVL = scanner.nextLine();
            if (idVL.matches(regexID)){
                villa.setId(idVL);
                checkValid = true;
            }else {
                System.out.println("ID khong hop le vui long nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;
        String regexNameSV = "^[A-Z][^A-Z0-9]+$";
        do {
            System.out.println("Nhap ten Villa");
            String nameVilla =  scanner.nextLine();
            if (nameVilla.matches(regexNameSV)){
                villa.setNameService(nameVilla);
                checkValid = true;
            }else{
                System.out.println("Ten khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;
        String regexSPool = "^[0-9]+$";
        do {
            System.out.println("Nhap dien tich su dung ");
            String sPool = scanner.nextLine();
            if(sPool.matches(regexSPool) && Integer.parseInt(sPool) >= 30){
                villa.setAcreage(Integer.parseInt(sPool));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , Xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap gia thue ");
            String cost = scanner.nextLine();
            if (cost.matches(regexSPool) && Integer.parseInt(cost) >= 0){
                villa.setCost(Integer.parseInt(cost));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap so luong nguoi toi da ");
            String numPerson = scanner.nextLine();
            if (numPerson.matches(regexSPool) && Integer.parseInt(numPerson) > 0 && Integer.parseInt(numPerson) < 20){
                villa.setQuantity(Integer.parseInt(numPerson));
                checkValid = true;
            }else {
                System.out.println("khong hop le !!!");
            }
        }while (!checkValid);
        checkValid = false;
        String regexMoreSer = "^(massage|karaoke|food|drink|car)$";
        do {
            System.out.println("Nhap mo ta tien nghi ");
            String moreSer = scanner.nextLine();
            if(moreSer.matches(regexMoreSer)){
                villa.setMoreService(moreSer);
                checkValid = true;
            }else {
                System.out.println("khong co dich vu " + moreSer);
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap so tang ");
            String floor = scanner.nextLine();
            if (floor.matches(regexSPool) && Integer.parseInt(floor) >= 0){
                villa.setFloor(Integer.parseInt(floor));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap kieu thue theo nam thang ngay gio");
            String typeHide =  scanner.nextLine();
            if (typeHide.matches(regexNameSV)){
                villa.setDayRents(typeHide);
                checkValid = true;
            }else{
                System.out.println("Kieu thue khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap tieu chuan phong");
            String typeRoom =  scanner.nextLine();
            if (typeRoom.matches(regexNameSV)){
                villa.setTypeRoom(typeRoom);
                checkValid = true;
            }else{
                System.out.println("Khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap dien tich ho boi ");
            String sPool = scanner.nextLine();
            if(sPool.matches(regexSPool) && Integer.parseInt(sPool) >= 30){
                villa.setPoolArea(Integer.parseInt(sPool));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , Xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        listVilla.add(villa);
        String line = "";
        for (Villa vl: listVilla) {
            line =  vl.getId() + COMMA  + vl.getNameService() + COMMA  + vl.getAcreage()
                    + COMMA + vl.getCost() + COMMA + vl.getQuantity() + COMMA + vl.getDayRents()
                    + COMMA + vl.getTypeRoom() + COMMA + vl.getMoreService() + COMMA + vl.getPoolArea()
                    + COMMA + vl.getFloor();
            InputOutput.writeFile(FILE_NAME_VILLA,line);
        }
    }
    private static void addNewHouse() {
        ArrayList<House> listHouse = new ArrayList<House>();
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        boolean checkValid = false;
        String regexID = "(SVHO)-[0-9]{4}";
        do{
            System.out.println("Nhap id House : ");
            String idH = scanner.nextLine();
            if (idH.matches(regexID)){
                house.setId(idH);
                checkValid = true;
            }else {
                System.out.println("Id khong hop le , vui long nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;

        String regexNameHouse = "^[A-Z][^A-Z0-9]+$";
        do {
            System.out.println("Nhap ten House");
            String nameHouse =  scanner.nextLine();
            if (nameHouse.matches(regexNameHouse)){
                house.setNameService(nameHouse);
                checkValid = true;
            }else{
                System.out.println("Ten khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;
        String regexS = "^[0-9]+$";
        do {
            System.out.println("Nhap dien tich su dung ");
            String s = scanner.nextLine();
            if(s.matches(regexS) && Integer.parseInt(s) >= 30){
                house.setAcreage(Integer.parseInt(s));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , Xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap gia thue ");
            String costH = scanner.nextLine();
            if (costH.matches(regexS) && Integer.parseInt(costH) >= 0){
                house.setCost(Integer.parseInt(costH));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap so luong nguoi toi da ");
            String numPerson = scanner.nextLine();
            if (numPerson.matches(regexS) && Integer.parseInt(numPerson) > 0 && Integer.parseInt(numPerson) < 20){
                house.setQuantity(Integer.parseInt(numPerson));
                checkValid = true;
            }else {
                System.out.println("khong hop le !!!");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap kieu thue theo nam thang ngay gio");
            String typeHide =  scanner.nextLine();
            if (typeHide.matches(regexNameHouse)){
                house.setDayRents(typeHide);
                checkValid = true;
            }else{
                System.out.println("Kieu thue khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap tieu chuan phong");
            String typeRoom =  scanner.nextLine();
            if (typeRoom.matches(regexNameHouse)){
                house.setTypeRoom(typeRoom);
                checkValid = true;
            }else{
                System.out.println("Khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;

        String regexMoreSer = "^(massage|karaoke|food|drink|car)$";
        do {
            System.out.println("Nhap mo ta tien nghi ");
            String moreSer = scanner.nextLine();
            if(moreSer.matches(regexMoreSer)){
                house.setMoreService(moreSer);
                checkValid = true;
            }else {
                System.out.println("khong co dich vu " + moreSer);
            }
        }while (!checkValid);
        checkValid = false;

        do {
            System.out.println("Nhap so tang ");
            String floor = scanner.nextLine();
            if (floor.matches(regexS) && Integer.parseInt(floor) >= 0){
                house.setFloor(Integer.parseInt(floor));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        listHouse.add(house);
        String line = "";
        for (House h: listHouse) {
            line =  h.getId() + COMMA +  h.getNameService() + COMMA+ h.getAcreage()
                    + COMMA + h.getCost() + COMMA + h.getQuantity() + COMMA + h.getDayRents()
                    + COMMA + h.getTypeRoom() + COMMA + h.getMoreService()
                    + COMMA + h.getFloor();
            InputOutput.writeFile(FILE_NAME_HOUSE,line);
        }
    }
    private static void addNewRoom() {
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        boolean checkValid = false;
        String regexID = "SVRO-[0-9]{4}";
        do{
            System.out.println("Nhap id Room : ");
            String idR = scanner.nextLine();
            if (idR.matches(regexID)){
                room.setId(idR);
                checkValid = true;
            }
        }while (!checkValid);
        checkValid = false;

        String regexNameSV = "^[A-Z][^A-Z0-9]+$";
        do {
            System.out.println("Nhap ten Room");
            String nameRoom =  scanner.nextLine();
            if (nameRoom.matches(regexNameSV)){
                room.setNameService(nameRoom);
                checkValid = true;
            }else{
                System.out.println("Ten khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;

        String regexS = "^[0-9]+$";
        do {
            System.out.println("Nhap dien tich su dung ");
            String s = scanner.nextLine();
            if(s.matches(regexS) && Integer.parseInt(s) >= 30){
                room.setAcreage(Integer.parseInt(s));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , Xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap gia thue ");
            String cost = scanner.nextLine();
            if (cost.matches(regexS) && Integer.parseInt(cost) >= 0){
                room.setCost(Integer.parseInt(cost));
                checkValid = true;
            }else {
                System.out.println("Khong hop le , xin nhap lai !!!");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap so luong nguoi toi da ");
            String numPerson = scanner.nextLine();
            if (numPerson.matches(regexS) && Integer.parseInt(numPerson) > 0 && Integer.parseInt(numPerson) < 20){
                room.setQuantity(Integer.parseInt(numPerson));
                checkValid = true;
            }else {
                System.out.println("khong hop le !!!");
            }
        }while (!checkValid);
        checkValid = false;
        String regexMoreSer = "^[A-Z][^A-Z_0-9]+$";
        do {
            System.out.println("Nhap dich vu mien phi di kem ");
            String freeSer = scanner.nextLine();
            if(freeSer.matches(regexMoreSer)){
                room.setFreeService(freeSer);
                checkValid = true;
            }else {
                System.out.println("Khong hop le ");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            System.out.println("Nhap kieu thue theo nam thang ngay gio");
            String typeHide =  scanner.nextLine();
            if (typeHide.matches(regexNameSV)){
                room.setDayRents(typeHide);
                checkValid = true;
            }else{
                System.out.println("Kieu thue khong hop le , xin ban nhap lai !!! ");
            }
        }while (!checkValid);
        checkValid = false;
        listRoom.add(room);
        String line = "";
        for (Room r: listRoom) {
            line =  r.getId() + COMMA +  r.getNameService() + COMMA + r.getAcreage()
                    + COMMA + r.getCost() + COMMA + r.getQuantity() + COMMA + r.getDayRents()
                    + COMMA + r.getFreeService();
            InputOutput.writeFile(FILE_NAME_ROOM,line);
        }
    }
    private static void addNewCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        boolean checkValid = false;
        do {
            try{
                System.out.println("Nhap ho va ten khach hang : ");
                String nameCus = scanner.nextLine();
                if (ExceptionCustomer.nameCustomer(nameCus)){
                    customer.setHoTen(nameCus);
                    checkValid = true;
                }
            }catch (Exception n){
                System.err.println("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            try{
                System.out.println("Nhap ngay sinh ");
                String birthDay = scanner.nextLine();
                if (ExceptionCustomer.birthdayException(birthDay)){
                    customer.setDateBirth(birthDay);
                    checkValid = true;
                }
            }catch (Exception b){
                System.err.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            try{
                System.out.println("Nhap gioi tinh ");
                String gender = scanner.nextLine();
                if (ExceptionCustomer.genderException(gender).equals("Male")){
                    customer.setGender("Male");
                    checkValid = true;
                }else if (ExceptionCustomer.genderException(gender).equals("Female")){
                    customer.setGender("Female");
                    checkValid = true;
                }else if (ExceptionCustomer.genderException(gender).equals("Unknow")){
                    customer.setGender("Unknow");
                    checkValid = true;
                }
            }catch (Exception g){
                System.err.println("Male , Female or Unknow ? ");
            }
        }while (!checkValid);
        checkValid = false;

        do {
            try{
                System.out.println("Nhap CMND ");
                String cmndCus = scanner.nextLine();
                if (ExceptionCustomer.idCardException(cmndCus)){
                    customer.setIdCustomer(cmndCus);
                    checkValid = true;
                }
            }catch (Exception i){
                System.err.println("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
            }
        }while (!checkValid);
        checkValid = false;
        String REGEX_PHONE = "^[0-9]{10}$";
        do {
            System.out.println("Nhap so ĐT ");
            String phoneNum = scanner.nextLine();
            if (phoneNum.matches(REGEX_PHONE)){
                customer.setPhone(phoneNum);
                checkValid = true;
            }else {
                System.err.println("Phai du 10 so");
            }
        }while (!checkValid);
        checkValid = false;
        do {
            try{
                System.out.println("Nhap email ");
                String emailCus = scanner.nextLine();
                if (ExceptionCustomer.emailException(emailCus)){
                    customer.setEmail(emailCus);
                    checkValid = true;
                }
            }catch (Exception e){
                System.err.println("Email phải đúng định dạng abc@abc.abc");
            }
        }while (!checkValid);
        checkValid = false;
        System.out.println("Nhap loai khach ");
        customer.setMember(scanner.nextLine());
        System.out.println("Nhap dia chi khach hang ");
        customer.setAddress(scanner.nextLine());
        listCustomer.add(customer);
        String line = "";
        for (Customer cus: listCustomer) {
            line = cus.getHoTen() + COMMA + cus.getDateBirth() + COMMA + cus.getGender()
                    + COMMA + cus.getIdCustomer() + COMMA + cus.getPhone() + COMMA + cus.getEmail()
                    + COMMA + cus.getMember() + COMMA + cus.getAddress();
            InputOutput.writeFile(FILE_NAME_CUSTOMER,line);
        }
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
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
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
    private static void showAllHouse() {
        List<House> listlineHouse = InputOutput.readFileHouse(FILE_NAME_HOUSE);
        for (int i = 0 ; i < listlineHouse.size();i++){
            System.out.println("-------------    "+(i+1) + "    -------------" + listlineHouse.get(i)+"\n");
        }
        System.out.println("-----------------------------------");
    }
    private static void showAllRoom() {
        List<Room> listlineRoom = InputOutput.readFileRoom(FILE_NAME_ROOM);
        for (int i = 0 ; i < listlineRoom.size();i++){
            System.out.println("-------------    "+(i+1) + "    -------------" + listlineRoom.get(i)+"\n");
        }
        System.out.println("-----------------------------------");
    }
    private static void showAllVilla() {
        List<Villa> listVilla = InputOutput.readFileVilla(FILE_NAME_VILLA);
        for (int i = 0 ; i < listVilla.size();i++){
            System.out.println("-------------    "+(i+1) + "    -------------" + listVilla.get(i)+"\n");
        }
        System.out.println("-----------------------------------");
    }
    private static void showInformationCustomers(){
        List<Customer> listCustomer = InputOutput.readFileCustomer(FILE_NAME_CUSTOMER);
        listCustomer.sort(new SortCustomer());
        for (int i = 0 ; i < listCustomer.size(); i++){
            System.out.println("-------------    "+(i+1)+"    -------------" + listCustomer.get(i)+"\n");
        }
        System.out.println("-----------------------------------");
    }
    private static void showInformationEmployee() {
        Map<String,Employee> mapOfEmployee = InputOutput.readFileEmployee(FILE_NAME_EMPLOYEE);
//    for (int i = 0 ; i<mapOfEmployee.size();i++){
//        System.out.println((i+1)+"----------"+mapOfEmployee.get(i)+"\n");
//    }
        System.out.println("-------------------------------------------");
        for (Map.Entry<String,Employee> employeeEntry : mapOfEmployee.entrySet()){
            System.out.println(employeeEntry.getKey() + " " + employeeEntry.getValue().toString());
            System.out.println("-------------------------------------------");
        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
