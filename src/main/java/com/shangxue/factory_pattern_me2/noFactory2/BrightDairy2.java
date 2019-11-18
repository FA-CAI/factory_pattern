package com.shangxue.factory_pattern_me2.noFactory2;


import com.shangxue.factory_pattern_me2.Milk2;

/**
 * 光明
 * */
public class BrightDairy2 implements Milk2 {


    @Override
    public String getPureMilkName() {
        return "光明纯牛奶";
    }

    @Override
    public String getSourMilkName() {
        return "光明酸牛奶";
    }

    @Override
    public String getSweetMilkName() {
        return "光明甜牛奶";
    }




}
