package com.example.ontap_dethithu;

import java.io.Serializable;

public class congnhan implements Serializable {
    private String hoten,luong;

    public congnhan(String hoten, String luong) {
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }
}
