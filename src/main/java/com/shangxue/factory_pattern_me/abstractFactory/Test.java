package com.shangxue.factory_pattern_me.abstractFactory;

public class Test {

    public static void main(String[] args) {
        AbstractFactory abstractFactory=new MilkFactory();
        System.out.println(abstractFactory.getMengniu());
    }

}

/**
 * 我这里还有个局限性：代码量太少，一个特别工厂里只有一个特别产品，这样子，其实不容易让观众体会到抽象工厂的优越性和此模式仍存在缺陷，虽然已经能看出来扩展听容易的了。
 *
 * 看我的factory_pattern_me2（当一个牌子内部出现分化[比如蒙牛不是蒙牛牛奶而产品出现了蒙牛酸、蒙牛甜、蒙牛纯等多种小品种]，而使得工厂用另一种分类方式时），应该就能更体会到抽象工厂的利弊了！（本文参考的练习demo原作作者有这方面的教育趋向，但是例子举的太傻逼了，反让人更难理解了，别说体会设计模式了，我连他的代码逻辑目的是干什么都难以理解，属实捣糨糊弱智教程）
 */



