package com.patika.domain;

import com.patika.base.BaseEntity;

public class Villa extends BaseEntity {

    private double price;
    private int size;
    private int roomsOfNumber;
    private int livingRoomsOfNumber;

    public Villa(double price, int size, int roomsOfNumber, int livingRoomsOfNumber) {
        this.price = price;
        this.size = size;
        this.roomsOfNumber = roomsOfNumber;
        this.livingRoomsOfNumber = livingRoomsOfNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getRoomsOfNumber() {
        return roomsOfNumber;
    }

    @Override
    public int getLivingRoomsOfNumber() {
        return livingRoomsOfNumber;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "price=" + price +
                ", size=" + size +
                ", roomsOfNumber=" + roomsOfNumber +
                ", livingRoomsOfNumber=" + livingRoomsOfNumber +
                '}';
    }
}
