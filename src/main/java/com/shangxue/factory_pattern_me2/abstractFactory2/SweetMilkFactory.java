package com.shangxue.factory_pattern_me2.abstractFactory2;

import com.shangxue.factory_pattern_me2.factoryMethod.BrightDairyFactory2;
import com.shangxue.factory_pattern_me2.factoryMethod.MengniuFactory2;
import com.shangxue.factory_pattern_me2.factoryMethod.YiliFactory2;

public class SweetMilkFactory extends AbstractFactory {
//工厂的工厂,总觉得有点难以蛋疼，代码还需要增加点（估计是加个口味接口？）

    @Override
    public String getBrightDairy() {
       return new BrightDairyFactory2().getSweetMilkFactory();
    }

    @Override
    public String getMengniu() {
        return new MengniuFactory2().getSweetMilkFactory();
    }

    @Override
    public String getYili() {
        return new YiliFactory2().getSweetMilkFactory();
    }
}
