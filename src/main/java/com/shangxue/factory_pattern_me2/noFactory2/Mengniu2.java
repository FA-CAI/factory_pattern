package com.shangxue.factory_pattern_me2.noFactory2;


import com.shangxue.factory_pattern_me2.Milk2;

public class Mengniu2 implements Milk2 {

    @Override
    public String getPureMilkName() {
        return "蒙牛纯牛奶";
    }

    @Override
    public String getSourMilkName() {
        return "蒙牛酸牛奶";
    }

    @Override
    public String getSweetMilkName() {
        return "蒙牛甜牛奶";
    }
}
