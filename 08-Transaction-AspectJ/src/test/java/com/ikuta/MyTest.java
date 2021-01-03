package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.service.BuyGoodsService;

public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取service
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");
        service.buy(1002, 50);
        // service.buy(1002, 100);//NotEnoughException: 编号:1002,商品库存不足
        // service.buy(1005, 10);//NullPointerException: 编号:1005,商品不存在
    }
}
