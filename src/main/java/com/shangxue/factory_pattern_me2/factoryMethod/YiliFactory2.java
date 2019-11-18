package com.shangxue.factory_pattern_me2.factoryMethod;

import com.shangxue.factory_pattern_me2.noFactory2.BrightDairy2;
import com.shangxue.factory_pattern_me2.noFactory2.Yili2;

public class YiliFactory2 implements Factory2  {


    @Override
    public String getPureMilkFactory() {
        return new Yili2().getPureMilkName();
    }

    @Override
    public String getSourMilkFactory() {
        return new Yili2().getSourMilkName();
    }

    @Override
    public String getSweetMilkFactory() {
        return new Yili2().getSweetMilkName();
    }
}
