package com.ikuta.ba02;

//功能增强:在doOther()方法执行之后提交事务
public class SomeServiceImpl implements SomeService {
    @Override
    public String doOther(String name, Integer age) {
        System.out.println("调用目标方法doOther()");
        return "abcd";
    }

}
