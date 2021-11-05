package case_study.furama_resort.commons;

import case_study.furama_resort.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputOutput {
    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Villa> readFileVilla(String pathFile){
        List<Villa> listVilla = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String lineVilla = null;
            String[] readLineVilla = null;
            Villa villa = null;
            while ((lineVilla = bufferedReader.readLine()) != null){
                readLineVilla = lineVilla.split(",");
                villa = new Villa(readLineVilla[0],readLineVilla[1],Integer.parseInt(readLineVilla[2]),Integer.parseInt(readLineVilla[3]),Integer.parseInt(readLineVilla[4]),readLineVilla[5],readLineVilla[6],readLineVilla[7],Integer.parseInt(readLineVilla[8]),Integer.parseInt(readLineVilla[9]));
                listVilla.add(villa);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return listVilla;
    }
    public static List<House> readFileHouse(String pathFile){
        List<House> houseList = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String lineHouse;
            String[] readlineHouse;
            House house;
            while ((lineHouse = bufferedReader.readLine()) != null){
                readlineHouse = lineHouse.split(",");
                house = new House(readlineHouse[0],readlineHouse[1],Integer.parseInt(readlineHouse[2]),Integer.parseInt(readlineHouse[3]),Integer.parseInt(readlineHouse[4]),readlineHouse[5],readlineHouse[6],readlineHouse[7],Integer.parseInt(readlineHouse[8]));
                houseList.add(house);
            }
        }catch (IOException i){
            i.printStackTrace();
        }
        return houseList;
    }
    public static List<Room> readFileRoom(String pathFile) {
        List<Room> roomList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String lineRoom;
            String[] readLineRoom;
            Room room;
            while ((lineRoom = bufferedReader.readLine()) != null) {
                readLineRoom = lineRoom.split(",");
                room = new Room(readLineRoom[0], readLineRoom[1], Integer.parseInt(readLineRoom[2]),
                        Integer.parseInt(readLineRoom[3]), Integer.parseInt(readLineRoom[4]), readLineRoom[5],
                        readLineRoom[6]);
                roomList.add(room);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
    public static Map<String,Employee> readFileEmployee(String pathFile){
        Map<String,Employee> mapOfEmployee = new HashMap<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String lineEmployee;
            String[] readLineEmployyee;
            Employee employee;
            while ((lineEmployee = bufferedReader.readLine()) != null){
                readLineEmployyee = lineEmployee.split(",");
                employee = new Employee(readLineEmployyee[0],readLineEmployyee[1],readLineEmployyee[2],readLineEmployyee[3]);
                mapOfEmployee.put(employee.getId(),employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapOfEmployee;
    }
    public static List<Customer> readFileCustomer(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineCustomer;
            String[] readLineCustomer;
            Customer customer;
            while ((lineCustomer = bufferedReader.readLine()) != null) {
                readLineCustomer = lineCustomer.split(",");
                customer = new Customer(readLineCustomer[0], readLineCustomer[1],
                         readLineCustomer[2], readLineCustomer[3],
                        readLineCustomer[4],readLineCustomer[5],readLineCustomer[6],readLineCustomer[7]);
                customerList.add(customer);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}