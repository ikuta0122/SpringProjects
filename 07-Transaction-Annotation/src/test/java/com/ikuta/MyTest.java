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

        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");// 从容器中获取service
        service.buy(1003, 10);
        // service.buy(1005, 10);//NullPointerException: 编号:1005,商品不存在
        // service.buy(1001, 100);//NotEnoughException: 编号:1001,商品库存不足
    }
}
