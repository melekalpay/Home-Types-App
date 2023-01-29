package com.patika.base;

import com.patika.domain.House;
import com.patika.domain.SummerHouse;
import com.patika.domain.Villa;

public interface Addability {
    void addToHouseList(House house);
    void addToSummerHouseList(SummerHouse summerHouse);
    void addToVillaList(Villa villa);
}
