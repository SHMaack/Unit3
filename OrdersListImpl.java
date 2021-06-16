package com.olympic.cis143.m03.student.tacotruck;

import java.util.*;

public class OrdersListImpl implements Orders
{

    private ArrayList<TacoImpl> tacoQueue = new ArrayList<>();

    @Override
    public void addOrder(TacoImpl tacoOrder) {
        this.tacoQueue.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
        return !this.tacoQueue.isEmpty();
    }

    @Override
    public TacoImpl closeNextOrder() {
        return  this.tacoQueue.remove(0);
    }

    @Override
    public int howManyOrders() {
        return this.tacoQueue.size();
    }
}