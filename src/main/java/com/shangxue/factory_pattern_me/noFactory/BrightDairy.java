package com.shangxue.factory_pattern_me.noFactory;

import com.shangxue.factory_pattern_me.Milk;

/**
 * 光明
 * */
public class BrightDairy implements Milk {


    @Override
    public String getName() {

        //我用字符串代表实际开发中的代码逻辑，比如 Todo 筛选过滤条件、事务、产品的一些特异性处理比如循环共三次X射线消毒然后循环共三层利乐包装,return entity
        return "光明牛奶";
    }
}
