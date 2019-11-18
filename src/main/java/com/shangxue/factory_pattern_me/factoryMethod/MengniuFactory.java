package com.shangxue.factory_pattern_me.factoryMethod;

import com.shangxue.factory_pattern_me.Milk;
import com.shangxue.factory_pattern_me.noFactory.Mengniu;

public class MengniuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
