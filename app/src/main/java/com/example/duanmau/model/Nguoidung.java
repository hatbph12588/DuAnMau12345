package com.example.duanmau.model;

public class Nguoidung {
    private String username;
    private String password;
    private String phone;
    private String hoTen;

    public Nguoidung() {
    }

    public Nguoidung(String username, String password, String phone, String hoTen) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.hoTen = hoTen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    @Override
    public String toString() {
        return "Nguoidung{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
