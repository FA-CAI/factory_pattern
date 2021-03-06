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


/**利弊总结：
 *优点
 （1）简单工厂包含必要的判断逻辑，简单工厂实现了对象的创建和使用的分离。
 （2）客户端无需知道所创建的具体产品类的类名，只需要具体产品类对应的参数即可（“别名”？），只知道入参出参，会有什么结果，而不知过程（面向对象）。
 （3）在不修改任何客户端（客户程序员的？）代码（这客户理解成我提供接口就是提供服务，我好比服务端，所以，客户那边其实改动还是他们的程序员去改）的情况下更换和增加新的具体产品类，在一定程度上提高了系统的灵活性

 缺点
 （1）工厂类的职责过重，从类图中可以看出简单工厂中包含所有的产品的生产逻辑（只是我们这写得比较简单而已），它一旦有问题，整个系统都要出问题！（那么，必须进一步解耦合了：然后，发展出了工厂方法模式）
 （2）在添加新的类的时候，例如我添加“蒙牛”“伊利”“安佳”“三元”，那么系统中的简单工厂类就要大幅度修改（而不能是仅仅扩展一个接口就完事了），违反了开放——封闭原则！这样及其不利于系统的维护和扩展！
 （3） 划掉、存疑（简单工厂的静态方法，使得工厂角色无法形成基于继承的等级结构！）
 */


//我们知道，不同牌子的牛奶肯定配比标准（允许每个产品有自己的私人标准）不一样，我们的牛奶工厂希望啥牌子牛奶都能生产，那就厉害了。这样，我们会很方便



