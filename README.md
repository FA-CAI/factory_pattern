

//阅读顺序(ReadMe.md)： noFactory,simpleFactory,factoryMethod,abstractFactory，体会工厂的进化发展，才能明白为什么工厂一步步出现新的模式，内在逻辑是什么：为了解决什么痛点〖优、利〗，但它又带来了什么弊端〖劣、弊〗




   #TODO
总体再归纳一篇博客



#总结

依赖倒置原则：要依赖抽象，不要依赖具体类 —— 不能让高层组件依赖底层组件，而且，不管是高层还是底层组件，都应该依赖于抽象。想要遵循依赖倒置原则，工厂模式并非是唯一的技巧，但却是最有威力的技巧之一。
编写模块的实现依赖于抽象，在运行时传入具体的实现细节， 这就是依赖倒置的工作原理。依赖倒置原则教我们尽量避免使用具体类，而多使用抽象。
依赖倒置原则的目的是让程序员脱离底层粘合代码（背诵具体实现类。解耦合），编写上层业务逻辑代码。这就让上层代码依赖于底层细节的抽象，从而可以重用上层代码。这种模块化和重用方式是双向的：既可以替换不同的细节重用上层代码，也可以替换不同的业务逻辑重用细节的实现。
优点：
 1、封装变化。将创建对象的代码集中在一个对象或方法中，可以避免代码的重复。
 2、面向接口编程。在实例化对象时，向客户隐藏了实例化的细节，用户只需要关心所需产品对应的工厂，无需关心创建细节，甚至无须知道具体产品类的类名。
缺点：
 1、系统中类的个数会增加，在一定程度上增加了系统的复杂度，会给系统带来一些额外的开销。
 2、由于考虑到系统的可扩展性，需要引入抽象层，增加了系统的抽象性和理解难度。