package com.shangxue.factory_pattern_me2.factoryMethod;

import com.shangxue.factory_pattern_me2.Milk2;
import com.shangxue.factory_pattern_me2.noFactory2.BrightDairy2;

public class BrightDairyFactory2 implements Factory2  {


    @Override
    public String getPureMilkFactory() {
        return new BrightDairy2().getPureMilkName();
    }

    @Override
    public String getSourMilkFactory() {
        return new BrightDairy2().getSourMilkName();
    }

    @Override
    public String getSweetMilkFactory() {
        return new BrightDairy2().getSweetMilkName();
    }
}
