package com.patika.domain;


import com.patika.base.Addability;

import java.util.ArrayList;
import java.util.List;

public class Manangement implements Addability {
    private List<House> houseList = new ArrayList<>();
    private List<SummerHouse> summerHouseList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();


    public List<House> getHouseList() {
        return houseList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    @Override
    public void addToHouseList(House house) {
        houseList.add(house);
    }

    @Override
    public void addToSummerHouseList(SummerHouse summerHouse) {
        summerHouseList.add(summerHouse);
    }

    @Override
    public void addToVillaList(Villa villa) {
        villaList.add(villa);
    }
}
