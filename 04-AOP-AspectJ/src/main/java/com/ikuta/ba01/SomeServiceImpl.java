package com.ikuta.ba01;

//功能增强:在doSome()方法执行之前输出方法的执行时间
public class SomeServiceImpl implements SomeService {

	@Override
	public void doSome(String name, Integer age) {
		System.out.println("调用目标方法doSome()");
	}

}
