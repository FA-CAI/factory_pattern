package com.shangxue.factory_pattern_me2.abstractFactory2;



public abstract class AbstractFactory {
    //TODO
    //正常调用逻辑应该是根据工厂得到光明牌工厂，然后根据光明牌工厂的到酸奶。代码需要改，逻辑不对，返回String不行，没有扩展性啥垃圾玩意儿
        //① 大概改成这个模式https://blog.csdn.net/jerry11112/article/details/80618420
        //② 增加各个工厂利弊总结，并且总体再归纳一篇博客

    /**
     * 获得光明牌牛奶
     */
    public abstract String getBrightDairy();
    /**
     * 获得蒙牛牌牛奶
     */
    public abstract String getMengniu();
    /**
     * 获得伊利牌牛奶
     */
    public abstract String getYili();



}

