package com.example.listview2;

public class Food {
    private String Ten;
    private String MoTa;
    private String SoTien;
    private int HinhMonAn;

    public Food(String ten, String moTa, String soTien, int hinhMonAn) {
        Ten = ten;
        MoTa = moTa;
        SoTien = soTien;
        HinhMonAn = hinhMonAn;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getSoTien() {
        return SoTien;
    }

    public void setSoTien(String soTien) {
        SoTien = soTien;
    }

    public int getHinhMonAn() {
        return HinhMonAn;
    }

    public void setHinhMonAn(int hinhMonAn) {
        HinhMonAn = hinhMonAn;
    }
}
