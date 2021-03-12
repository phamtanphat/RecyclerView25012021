package com.example.recyclerview25012021;

import java.util.Arrays;
import java.util.Objects;

public class FoodyModel {
    private boolean status;
    private int image;
    private String name;
    private String address;
    private String[] saleOffs;

    public FoodyModel(boolean status, int image, String name, String address, String[] saleOffs) {
        this.status = status;
        this.image = image;
        this.name = name;
        this.address = address;
        this.saleOffs = saleOffs;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getSaleOffs() {
        return saleOffs;
    }

    public void setSaleOffs(String[] saleOffs) {
        this.saleOffs = saleOffs;
    }

    @Override
    public String toString() {
        return "FoodyModel{" +
                "status=" + status +
                ", image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", saleOffs=" + Arrays.toString(saleOffs) +
                '}';
    }
}
