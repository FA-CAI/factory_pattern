package com.shangxue.factory_pattern_me.factoryMethod;

import com.shangxue.factory_pattern_me.Milk;
import com.shangxue.factory_pattern_me.noFactory.BrightDairy;

//事情变得越来越“专业”了，某一工厂就只生产一种产品了（专门工厂！） （这就非常像我们现实中的城市工业化发展了吧？）
public class BrightDairyFactory implements  Factory{


    @Override
    public Milk getMilk() {
        return new BrightDairy();
    }
}
