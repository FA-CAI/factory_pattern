package com.shangxue.factory_pattern_me2.abstractFactory2;

public class Test {


    public static void main(String[] args) {

        AbstractFactory abstractFactory=new PureMilkFactory();//这里PureMilkFactory还可以再抽象吗？ 不然和工厂方法有啥区别呢，配置多会配错的这个弊端还在呀，只能说抽象工厂方法处理了品牌的填写，但是口味的填写是否还能再进化一下？
        System.out.println(abstractFactory.getBrightDairy());


        AbstractFactory abstractFactory2=new SourMilkFactory();
        System.out.println(abstractFactory2.getMengniu());


    }
}


