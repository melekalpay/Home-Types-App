package com.patika.base;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    public abstract double getPrice();

    public abstract int getSize();

    public abstract int getRoomsOfNumber();

    public abstract int getLivingRoomsOfNumber();


}
