package com.shangxue.factory_pattern_me2.abstractFactory2;



public abstract class AbstractFactory {

    /**
     *  就是 @return String 有点怪怪的   ？？？
     */


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

