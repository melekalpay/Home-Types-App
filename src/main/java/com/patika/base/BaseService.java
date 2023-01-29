package com.patika.base;


import java.util.List;


//Ev,Villa ve Yazlık tekrar eden fonksiyonlar için Generic Tipinde Servis
public abstract class BaseService <T extends BaseEntity> {
  public  Class <T> t;

    public BaseService(Class<T> t) {
        this.t = t;
    }

    public double getSumPrice(List<T> tList){
        double sumPrice =0;

        for(T t : tList){
            sumPrice += t.getPrice();
        }
        return sumPrice;
    }
    public double getAverageSize(List<T> list){
        int count = 0;
        int sum = 0;

        for(T t : list){
            sum += t.getSize();
            count++;
        }
        double averageSize = sum/count;
        return averageSize;
    }
}
