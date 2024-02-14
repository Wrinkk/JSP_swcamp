package com.ohgiraffers.common;

import java.util.Date;

public class Bread extends Product{

    private java.util.Date breadDate;   //생산  시간

    public Bread() {

    }

    public Bread(String name, int price, Date breadDate) {
        super(name, price);
        this.breadDate = breadDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
