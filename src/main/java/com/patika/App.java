package com.patika;

import com.patika.domain.Manangement;
import com.patika.domain.House;
import com.patika.domain.SummerHouse;
import com.patika.domain.Villa;
import com.patika.service.HouseService;
import com.patika.service.ManangementService;
import com.patika.service.SummerHouseService;
import com.patika.service.VillaService;


public class App 
{
    public static void main( String[] args )
    {
        Manangement manangement = new Manangement();
        HouseService houseService = new HouseService();
        VillaService villaService = new VillaService();
        SummerHouseService summerHouseService = new SummerHouseService();
        ManangementService manangementService = new ManangementService();

        House house1 = new House(100,100,3,1);
        manangement.addToHouseList(house1);
        House house2 = new House(200,120,5,1);
        manangement.addToHouseList(house2);
        House house3= new House(300,150,4,2);
        manangement.addToHouseList(house3);

        SummerHouse summerHouse1 = new SummerHouse(170,150,3,1);
        manangement.addToSummerHouseList(summerHouse1);
        SummerHouse summerHouse2= new SummerHouse(180,200,3,2);
        manangement.addToSummerHouseList(summerHouse2);
        SummerHouse summerHouse3= new SummerHouse(200,100,3,2);
        manangement.addToSummerHouseList(summerHouse3);

        Villa villa1= new Villa(180,200,5,2);
        manangement.addToVillaList(villa1);
        Villa villa2= new Villa(200,220,5,1);
        manangement.addToVillaList(villa2);
        Villa villa3= new Villa(120,120,3,1);
        manangement.addToVillaList(villa3);

       // Evlerin toplam fiyatı
        System.out.print("Sum House Price :");
        double housePriceSum = houseService.getSumPrice(manangement.getHouseList());
        System.out.println(housePriceSum);

        //Yazlık toplam fiyat
        System.out.print("Sum SummerHouse Price :");
        double summerHousePriceSum=summerHouseService.getSumPrice(manangement.getSummerHouseList());
        System.out.println(summerHousePriceSum);

        //Villa toplam fiyat
        System.out.print("Sum Villa Price :");
        double villaPriceSum=villaService.getSumPrice(manangement.getVillaList());
        System.out.println(villaPriceSum);

        //Toplam fiyat
        System.out.print("Sum Total Price :");
        double totalPriceOfHomes = manangementService.getSumAllTypeHomePrice(manangement);
        System.out.println(totalPriceOfHomes);

        //Ev Ortalama Metrekare
        System.out.print("Average House Size :");
        double averageSizeHouse = houseService.getAverageSize(manangement.getHouseList());
        System.out.println(averageSizeHouse);

        //Yazlık Ortalama Metrekare
        System.out.print("Average summerhouse Size :");
        double averageSizeSummerHouse= summerHouseService.getAverageSize(manangement.getSummerHouseList());
        System.out.println(averageSizeSummerHouse);

        //Villa ortalama metrekare
        System.out.print("Average Villa Size :");
        double averageSizeVilla= villaService.getAverageSize(manangement.getVillaList());
        System.out.println(averageSizeVilla);

        //Toplam ortalama metrekare
        System.out.print("Average Total All Types Size :");
        double averageSizeAllHomes = manangementService.getAverageSizeAllTypeHome(manangement);
        System.out.println(averageSizeAllHomes);

        //Oda ve salon sayısına göre tüm tipteki evleri filtreleme
        System.out.println("According to number of rooms and living rooms all types home :");
        manangementService.getNumberOfRoomsAndLivingRoomsForAllTypeHome(manangement);


    }
}
