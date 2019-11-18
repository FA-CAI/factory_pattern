package com.shangxue.factory_pattern_me2.abstractFactory2;


import com.shangxue.factory_pattern_me2.factoryMethod.BrightDairyFactory2;
import com.shangxue.factory_pattern_me2.factoryMethod.MengniuFactory2;
import com.shangxue.factory_pattern_me2.factoryMethod.YiliFactory2;



public class PureMilkFactory extends AbstractFactory {


    @Override
    public String getBrightDairy() {

        return new BrightDairyFactory2().getPureMilkFactory();
    }

    @Override
    public String getMengniu() {
        return new MengniuFactory2().getPureMilkFactory();
    }

    @Override
    public String getYili() {
        return new YiliFactory2().getPureMilkFactory();
    }
}
