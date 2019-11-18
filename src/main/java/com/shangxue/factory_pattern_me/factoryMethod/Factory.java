package com.shangxue.factory_pattern_me.factoryMethod;

import com.shangxue.factory_pattern_me.Milk;

//工厂式
public interface Factory {

    //工厂必然具有生产产品技能，统一的产品出口
    Milk getMilk();


}
