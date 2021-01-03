package com.ikuta.ba08;

//功能增强:在doOther()方法执行之后提交事务
public class SomeServiceImpl implements SomeService {
	@Override
	public void doSome() {
		System.out.println("调用目标方法doSome()");
	}
}
