

//阅读顺序(ReadMe.md)： noFactory,simpleFactory,factoryMethod,abstractFactory，体会工厂的进化发展，才能明白为什么工厂一步步出现新的模式，内在逻辑是什么：为了解决什么痛点〖优、利〗，但它又带来了什么弊端〖劣、弊〗




   #TODO

    //正常调用逻辑应该是根据工厂得到光明牌工厂，然后根据光明牌工厂的到酸奶。代码需要改，逻辑不对，返回String不行，没有扩展性啥垃圾玩意儿
        //① 大概改成这个模式https://blog.csdn.net/jerry11112/article/details/80618420
        //② 增加各个工厂利弊总结，并且总体再归纳一篇博客