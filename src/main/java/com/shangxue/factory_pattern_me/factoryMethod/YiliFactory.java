package com.shangxue.factory_pattern_me.factoryMethod;

import com.shangxue.factory_pattern_me.Milk;

import com.shangxue.factory_pattern_me.noFactory.Yili;

public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
