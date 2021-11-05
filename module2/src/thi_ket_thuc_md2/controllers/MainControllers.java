package thi_ket_thuc_md2.controllers;

import case_study.furama_resort.commons.InputOutput;
import thi_ket_thuc_md2.common.InOutPut;
import thi_ket_thuc_md2.models.BenhAnThuong;
import thi_ket_thuc_md2.models.BenhAnVip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllers {
    public static final String COMMA = ",";
    public static final String FILE_MEDICAL = "src\\thi_ket_thuc_md2\\data\\medical_records.csv";
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int section;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1.\tThêm mới\n" +
                    "2.\tXóa\n" +
                    "3.\tXem danh sách các bệnh án\n" +
                    "4.\tThoát\n");
            System.out.println("Chọn chức năng:");
            section = scanner.nextInt();
            switch (section) {
                case 1:
                    themBenhAn();
                    break;
                case 2:

                    break;
                case 3:
//                    xemDanhSachBenhAn();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (section != 0);
    }

    private static void xemDanhSachBenhAn() throws IOException {
        List<String> benhAnList = InOutPut.readFile(FILE_MEDICAL);
        System.out.println(benhAnList);
    }

    public static void themBenhAn(){
        Scanner scanner = new Scanner(System.in);
        int chosseService;
        System.out.println("1.\tThêm bệnh án thường\n" +
                "2.\tThêm bệnh án VIP\n" +
                "3.\tTrở lại trang chủ\n" +
                "4.\tThoát\n" );
        chosseService = scanner.nextInt();
        switch (chosseService){
            case 1:
                themBenhAnThuong();
                break;
            case 2:
                themBenhAnVip();
                break;
            case 3:
                displayMainMenu();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    private static void themBenhAnVip() {
        ArrayList<BenhAnVip> listBenhAnVip = new ArrayList<BenhAnVip>();
        Scanner scanner = new Scanner(System.in);
        BenhAnVip benhAnVip = new BenhAnVip();
        boolean checkValid = false;
        String regexMaBA = "BA-[0-9]{3}";
        do{
            System.out.println("Nhập mã bệnh án vip : ");
            String idBA = scanner.nextLine();
            if (idBA.matches(regexMaBA)){
                benhAnVip.setMaBenhAn(idBA);
                checkValid = true;
            }else {
                System.out.println("Mã bệnh án không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        String regexMaBN = "BN-[0-9]{3}";
        do{
            System.out.println("Nhập mã bệnh nhân vip : ");
            String idBN = scanner.nextLine();
            if (idBN.matches(regexMaBN)){
                benhAnVip.setMaBenhNhan(idBN);
                checkValid = true;
            }else {
                System.out.println("Mã bệnh nhân không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;

        System.out.println("Nhập tên bệnh nhân : ");
        String tenBenhNhan = scanner.nextLine();
        benhAnVip.setTenBenhNhan(tenBenhNhan);

        String regexDate = "^[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{4}$";
        do{
            System.out.println("Nhập ngày nhập viện : ");
            String ngayNhapVien = scanner.nextLine();
            if (ngayNhapVien.matches(regexDate)){
                benhAnVip.setNgayNhapVien(ngayNhapVien);
                checkValid = true;
            }else {
                System.out.println("Ngày nhập viện không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        do{
            System.out.println("Nhập ngày ra viện : ");
            String ngayRaVien = scanner.nextLine();
            if (ngayRaVien.matches(regexDate)){
                benhAnVip.setNgayRaVien(ngayRaVien);
                checkValid = true;
            }else {
                System.out.println("Ngày ra viện không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        System.out.println("Nhập lí do nhập viện");
        String liDo = scanner.nextLine();
        benhAnVip.setLiDoNhapVien(liDo);

        String regexVip = "^(VIP I|VIP II|VIP III)$";
        do{
            System.out.println("Nhập loại vip : ");
            String loaiVip = scanner.nextLine();
            if (loaiVip.matches(regexVip)){
                benhAnVip.setLoaiVip(loaiVip);
                checkValid = true;
            }else {
                System.out.println("Loại vip không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        do{
            System.out.println("Nhập thời hạn Vip : ");
            String thoiHanVip = scanner.nextLine();
            if (thoiHanVip.matches(regexDate)){
                benhAnVip.setThoiHanVip(thoiHanVip);
                checkValid = true;
            }else {
                System.out.println("Thời hạn không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        listBenhAnVip.add(benhAnVip);
        String line = "";
        for (BenhAnVip bav: listBenhAnVip) {
            line =  bav.getStt() + COMMA  + bav.getMaBenhAn() + COMMA  + bav.getTenBenhNhan()
                    + COMMA + bav.getNgayNhapVien() + COMMA + bav.getNgayRaVien() + COMMA + bav.getLiDoNhapVien()
                    + COMMA + bav.getLoaiVip() + COMMA + bav.getThoiHanVip();
            InputOutput.writeFile(FILE_MEDICAL,line);
        }
    }

    private static void themBenhAnThuong() {
        ArrayList<BenhAnThuong> listBenhAnThuong = new ArrayList<BenhAnThuong>();
        Scanner scanner = new Scanner(System.in);
        BenhAnThuong benhAnThuong = new BenhAnThuong();
        boolean checkValid = false;
        String regexMaBA = "BA-[0-9]{3}";
        do{
            System.out.println("Nhập mã bệnh án thường : ");
            String idBA = scanner.nextLine();
            if (idBA.matches(regexMaBA)){
                benhAnThuong.setMaBenhAn(idBA);
                checkValid = true;
            }else {
                System.out.println("Mã bệnh án không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        String regexMaBN = "BN-[0-9]{3}";
        do{
            System.out.println("Nhập mã bệnh nhân thường : ");
            String idBN = scanner.nextLine();
            if (idBN.matches(regexMaBN)){
                benhAnThuong.setMaBenhNhan(idBN);
                checkValid = true;
            }else {
                System.out.println("Mã bệnh nhân không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        System.out.println("Nhập tên bệnh nhân thường : ");
        String tenBenhNhan = scanner.nextLine();
        benhAnThuong.setTenBenhNhan(tenBenhNhan);

        String regexDate = "^[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{4}$";
        do{
            System.out.println("Nhập ngày nhập viện : ");
            String ngayNhapVien = scanner.nextLine();
            if (ngayNhapVien.matches(regexDate)){
                benhAnThuong.setMaBenhAn(ngayNhapVien);
                checkValid = true;
            }else {
                System.out.println("Ngày nhập viện không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        do{
            System.out.println("Nhập ngày ra viện : ");
            String ngayRaVien = scanner.nextLine();
            if (ngayRaVien.matches(regexDate)){
                benhAnThuong.setMaBenhAn(ngayRaVien);
                checkValid = true;
            }else {
                System.out.println("Ngày ra viện không hợp lệ ! Xin nhập lại !! ");
            }
        }while (!checkValid);
        checkValid = false;
        System.out.println("Nhập lí do nhập viện");
        String liDo = scanner.nextLine();
        benhAnThuong.setLiDoNhapVien(liDo);

        System.out.println("Nhập phí nằm viện");
        String phiNhapVien = scanner.nextLine();
        benhAnThuong.setPhiNamVien(Integer.parseInt(phiNhapVien));
        listBenhAnThuong.add(benhAnThuong);
        String line = "";
        for (BenhAnThuong bat: listBenhAnThuong) {
            line =  bat.getStt() + COMMA  + bat.getMaBenhAn() + COMMA  + bat.getTenBenhNhan()
                    + COMMA + bat.getNgayNhapVien() + COMMA + bat.getNgayRaVien() + COMMA + bat.getLiDoNhapVien()
                    + COMMA + bat.getPhiNamVien();
            InOutPut.writeFile(FILE_MEDICAL,line);
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
