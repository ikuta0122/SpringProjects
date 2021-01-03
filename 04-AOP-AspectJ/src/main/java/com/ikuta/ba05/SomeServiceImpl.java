package com.ikuta.ba05;

//功能增强:在doOther()方法执行之后提交事务
public class SomeServiceImpl implements SomeService {

	@Override
	public void doSome(String name, Integer age) {
		System.out.println("调用目标方法doSome()");
	}

	@Override
	public String doOther(String name, Integer age) {
		System.out.println("调用目标方法doOther()");
		return "abcd";
	}

	@Override
	public String doThird(String name, Integer age) {
		System.out.println("调用目标方法doThird()");
		return "Hello AspectJ";
	}

	@Override
	public void doForth() {
		System.out.println("调用目标方法doForth()" + (10 / 0));
	}

	@Override
	public void doFifth() {
		System.out.println("调用目标方法doFifth()");
	}

}
