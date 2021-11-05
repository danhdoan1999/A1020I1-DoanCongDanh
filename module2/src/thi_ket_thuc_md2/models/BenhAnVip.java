package thi_ket_thuc_md2.models;

public class BenhAnVip extends BenhAn {
    public String loaiVip;
    public String thoiHanVip;
    public BenhAnVip(){}

    public BenhAnVip(String loaiVip, String thoiHanVip) {
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
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
                "\n\tLoại VIP : " + getLoaiVip() +
                "\n\tThời hạn VIP : " + getThoiHanVip();
    }
}
