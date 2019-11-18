package com.shangxue.factory_pattern_me.abstractFactory;

import com.shangxue.factory_pattern_me.Milk;
import com.shangxue.factory_pattern_me.factoryMethod.BrightDairyFactory;
import com.shangxue.factory_pattern_me.factoryMethod.MengniuFactory;
import com.shangxue.factory_pattern_me.factoryMethod.YiliFactory;


public class MilkFactory extends AbstractFactory{


    @Override
    public Milk getBrightDairy() {
        //这里为什么是在工厂方法模式上发展而来new BrightDairyFactory().getMilk()，而不是直接new BrightDairy() 呢——上文说到为啥要发展成工厂方法模式时已经说过了，为了扩展，为了“规模化”。这里因为一个工厂里面就一个产品，代码文件、文件内代码量又少，所以你没接到扩展的任务前，没发现它的易维护性多好！
        //哦，不是，某老师说了这里可以不用工厂，他是为了牛逼练习特意和工厂方法混合组合使用~  Ps. Spring也是这么用的
        return new BrightDairyFactory().getMilk();
    }

    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }
}
