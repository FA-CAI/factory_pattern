package com.shangxue.factory_pattern_me.simpleFactory;

import com.shangxue.factory_pattern_me.Milk;
import com.shangxue.factory_pattern_me.noFactory.BrightDairy;
import com.shangxue.factory_pattern_me.noFactory.Mengniu;
import com.shangxue.factory_pattern_me.noFactory.Yili;

public class SimpleFactory {

    public Milk getmilk(String name){
       if("光明牛奶".equals(name)){

           return new BrightDairy();

       } //后续扩展
        else if("蒙牛牛奶".equals(name)){

           return new Mengniu();

       } else if("伊利牛奶".equals(name)){

           return new Yili();

       }
        System.out.println("我们不能生产您所需的产品");
       return null;

    }


}
