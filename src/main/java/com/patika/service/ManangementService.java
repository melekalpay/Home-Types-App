package com.patika.service;

import com.patika.domain.House;
import com.patika.domain.Manangement;
import com.patika.domain.SummerHouse;
import com.patika.domain.Villa;

import java.util.Scanner;

// Tüm Ev Tipleri için kullanılan servis
public class ManangementService {

    public void getNumberOfRoomsAndLivingRoomsForAllTypeHome(Manangement manangement){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Room number : ");
        int roomNum =scanner.nextInt();
        System.out.print("Living room number : ");
        int livingRoomNum = scanner.nextInt();

        for (House house : manangement.getHouseList()){
            if(house.getRoomsOfNumber() == roomNum && house.getLivingRoomsOfNumber()==livingRoomNum){
                System.out.println(house);
                count++;
            }
        }

        for (SummerHouse summerHouse : manangement.getSummerHouseList()){
            if(summerHouse.getRoomsOfNumber() == roomNum && summerHouse.getLivingRoomsOfNumber()==livingRoomNum){
                System.out.println(summerHouse);
                count++;
            }
        }

        for (Villa villa : manangement.getVillaList()){
            if(villa.getRoomsOfNumber() == roomNum && villa.getLivingRoomsOfNumber()==livingRoomNum){
                System.out.println(villa);
                count++;
            }
        }

        if(count == 0){
            System.out.println("There is no home found with this filter!");
        }
        else {
            System.out.println(count + " " + " home(s) found!");
        }

    }
    public double getSumAllTypeHomePrice(Manangement manangement){
        double sumPrice =0;

        for(House house : manangement.getHouseList()){
            sumPrice += house.getPrice();
        }
        for(SummerHouse summerHouse : manangement.getSummerHouseList()){
            sumPrice += summerHouse.getPrice();
        }
        for(Villa villa : manangement.getVillaList()){
            sumPrice += villa.getPrice();
        }
        return sumPrice;
    }

    public double getAverageSizeAllTypeHome(Manangement manangement){
        int count = 0;
        int sum = 0;

        for(House house : manangement.getHouseList()){
            sum += house.getSize();
            count++;
        }
        for(SummerHouse summerHouse : manangement.getSummerHouseList()){
            sum += summerHouse.getSize();
            count++;
        }
        for(Villa villa : manangement.getVillaList()){
            sum += villa.getSize();
            count++;
        }
        double averageSize = sum/count;

        return averageSize;
    }
}
