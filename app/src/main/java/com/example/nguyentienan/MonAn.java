package com.example.nguyentienan;

public class MonAn {
    private String tenmon;
    private String chitiet;
    private String giaca;
    private int anh;

    public MonAn(String tenmon, String chitiet, String giaca, int anh) {
        this.tenmon = tenmon;
        this.chitiet = chitiet;
        this.giaca = giaca;
        this.anh = anh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public String getGiaca() {
        return giaca;
    }

    public void setGiaca(String giaca) {
        this.giaca = giaca;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
