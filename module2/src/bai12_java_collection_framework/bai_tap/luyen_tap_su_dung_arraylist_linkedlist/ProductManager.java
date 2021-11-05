package bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();
    public static void mainControl(){
        System.out.println("1.Thêm sản phẩm\n" +
                "2.Sửa thông tin sản phẩm theo id\n" +
                "3.Xoá sản phẩm theo id\n" +
                "4.Hiển thị danh sách sản phẩm\n" +
                "5.Tìm kiếm sản phẩm theo tên\n" +
                "6.Sắp xếp sản phẩm tăng dần theo giá\n" +
                "7.Sắp xếp sản phẩm giảm dần theo giá");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                addProduct();
                break;
            case 2:
                editProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                showProduct();
                break;
            case 5:
                searchProduct();
                break;
            case 6:
                sortProductInc();
                showProduct();
                break;
            case 7:
                sortProductRed();
                showProduct();
                break;
        }
    }

    public static void sortProductInc() {
        Collections.sort(productList,new sapxepTang());
    }
    public static void sortProductRed() {
        Collections.sort(productList,new sapxepGiam());
    }

    private static void searchProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        Scanner scanner =new Scanner(System.in);
        String nameSearch = scanner.nextLine();
        ArrayList<Product> searchesProduct = new ArrayList<>();
        for (int i = 0 ; i < productList.size();i++){
            if(productList.get(i).getTenSP().equals(nameSearch)){
                searchesProduct.add(productList.get(i));
            }
        }
        for (Product search: searchesProduct) {
            System.out.println("---------------------");
            System.out.println("id : " + search.getId());
            System.out.println("Name : " + search.getTenSP());
            System.out.println("Price : " + search.getGiaSP());
        }
    }
    private static void deleteProduct() {
        System.out.println("Nhập id sản phẩm mà bạn muốn xóa ");
        int idDelete = input.nextInt();
        for (int i = 0 ; i < productList.size(); i++){
            if(productList.get(i).getId() == idDelete){
                productList.remove(i);
            }
        }
    }

    public static void addProduct(){
        System.out.println("Nhap vao id san pham");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap vao ten san pham");
        String tenSP = input.nextLine();
        System.out.println("Nhap vao gia san pham");
        double giaSP = input.nextDouble();
        Product product = new Product(id,tenSP,giaSP);
        productList.add(product);
    }
    private static void editProduct() {
        System.out.println("Nhập id sản phẩm mà bạn muốn thay đổi thông tin ");
        int idEdit = input.nextInt();
        input.nextLine();
        System.out.println("Nhập tên mới cho sản phẩm");
        String nameEdit = input.nextLine();
        System.out.println("Nhập vào giá mới cho sản phẩm");
        double priceEdit = input.nextDouble();
        for (int i = 0 ; i < productList.size();i++){
            if(productList.get(i).getId() == idEdit){
                productList.get(i).setTenSP(nameEdit);
                productList.get(i).setGiaSP(priceEdit);
                break;
            }
        }
    }

    private static void showProduct() {
        System.out.println("Danh sach san pham");
        for (Product products : productList){
            System.out.println("---------------------");
            System.out.println("id : " + products.getId());
            System.out.println("Name : " + products.getTenSP());
            System.out.println("Price : " + products.getGiaSP());
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        while (true){
            mainControl();
        }
    }
}
