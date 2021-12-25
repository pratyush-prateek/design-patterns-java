package com.designpatters.builder;

public class Client {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder order = builder.bread("Brown bread").condiment("Mayo").meat("Chicken").dressing("Mustard").build();

        System.out.println(order.getBread() + "," + order.getCondiment() + "," + order.getDressing() + "," + order.getMeat());
    }
}
