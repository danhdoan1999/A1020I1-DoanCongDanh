package case_study.furama_resort.controllers;

import case_study.furama_resort.models.Customer;

import java.util.Comparator;

public class SortCustomer implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getHoTen().compareTo(o2.getHoTen()) !=0){
            return o1.getHoTen().compareTo(o2.getHoTen());
        }else{
            int year1 = Integer.parseInt(o1.getDateBirth().substring(6,10));
            int year2 = Integer.parseInt(o2.getDateBirth().substring(6,10));
            return year1 - year2;
        }
    }
}
