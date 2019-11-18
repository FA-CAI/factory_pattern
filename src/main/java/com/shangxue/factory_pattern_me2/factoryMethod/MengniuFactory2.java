package com.shangxue.factory_pattern_me2.factoryMethod;

import com.shangxue.factory_pattern_me2.noFactory2.BrightDairy2;
import com.shangxue.factory_pattern_me2.noFactory2.Mengniu2;

public class MengniuFactory2 implements Factory2  {


    @Override
    public String getPureMilkFactory() {
        return new Mengniu2().getPureMilkName();
    }

    @Override
    public String getSourMilkFactory() {
        return new Mengniu2().getSourMilkName();
    }

    @Override
    public String getSweetMilkFactory() {
        return new Mengniu2().getSweetMilkName();
    }
}
