package com.shangxue.factory_pattern_me2.noFactory2;


import com.shangxue.factory_pattern_me2.Milk2;

public class Yili2 implements Milk2 {

    @Override
    public String getPureMilkName() {
        return "伊利纯牛奶";
    }

    @Override
    public String getSourMilkName() {
        return "伊利酸牛奶";
    }

    @Override
    public String getSweetMilkName() {
        return "伊利甜牛奶";
    }
}
