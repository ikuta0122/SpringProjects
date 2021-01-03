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
        // 异常抛出:service.buy(1005, 10);
        // 异常抛出:service.buy(1001, 100);
        service.buy(1001, 10);
    }
}
