package com.shangxue.factory_pattern_me2.factoryMethod;


import com.shangxue.factory_pattern_me2.Milk2;

//工厂式
public interface Factory2 {

    //纯牛奶工厂
    String getPureMilkFactory();

    //酸牛奶工厂
    String getSourMilkFactory();

    //甜牛奶工厂
    String getSweetMilkFactory();

}
