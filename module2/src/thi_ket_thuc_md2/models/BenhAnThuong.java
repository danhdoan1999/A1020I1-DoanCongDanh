package thi_ket_thuc_md2.models;

public class BenhAnThuong extends BenhAn {
    public int phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void xemBenhAn() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\n\tSố thứ tự : " + getStt() +
                "\n\tMã bệnh án : " + getMaBenhAn() +
                "\n\tMã bệnh nhân : " + getMaBenhNhan() +
                "\n\tTên bệnh nhân : " + getTenBenhNhan() +
                "\n\tNgày nhập viện : " + getNgayNhapVien() +
                "\n\tNgày ra viện : " + getNgayRaVien() +
                "\n\tLí do nhập viện : " + getLiDoNhapVien() +
                "\n\tPhí nằm viện : " + getPhiNamVien();
    }
}
