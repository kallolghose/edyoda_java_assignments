package com.edyoda.practice;

public class Mutuable {

    private String data;

    public Mutuable(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Mutuable mutuable = new Mutuable("10");
        System.out.println("Data : " + mutuable.getData());
        mutuable.setData("20");
        System.out.println("Data : " + mutuable.getData());
    }
}
