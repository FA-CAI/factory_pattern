package com.shangxue.factory_pattern_me.simpleFactory;



public class Test {


    public static void main(String[] args) {
        SimpleFactory factory= new SimpleFactory();
        System.out.println(factory.getmilk("光明牛奶"));

        //扩展之后
        System.out.println(factory.getmilk("蒙牛牛奶"));
    }
}
/**
 * 小作坊式的生产模式
 * 用户本身不再关心生产的过程(别人实现的细节)(不用知道实体类到底结构有多么复杂有多少字段具体类名是什么[我只要传一个字符串类型的别名，传这个参数给工厂，而这个咱们不同程序员写的不同类都可以约定为同一个别名，这就又有抽取抽象的感觉了，好像多态哦，而实际开发，会把这个字符串提取到配置文件的key（以方便日后修改不会像无头苍蝇到处找，归纳整理"统一管理"），的确是借此又“抽取抽象”了一下下])，而只需要关心生产的结果（面向对象）
 *
 *
 *
 *把用户的需求告诉工厂
 * 创建产品的过程隐藏了，对于用户而言完全不清楚是怎么产生的 （多么的面向对象）
 * */

//我们知道，不同牌子的牛奶肯定配比标准（允许每个产品有自己的私人标准）不一样，我们的牛奶工厂希望啥牌子牛奶都能生产，那就厉害了。这样，我们会很方便
