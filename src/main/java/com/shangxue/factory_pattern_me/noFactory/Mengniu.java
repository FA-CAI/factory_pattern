package com.shangxue.factory_pattern_me.noFactory;

import com.shangxue.factory_pattern_me.Milk;

public class Mengniu implements Milk {

    @Override
    public String getName() {
        return "蒙牛牛奶";
    }
}
