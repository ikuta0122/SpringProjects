package com.ikuta.service.impl;

import com.ikuta.service.SomeService;

public class SomeServiceImpl implements SomeService {
	public SomeServiceImpl() {
		System.out.println("执行SomeServiceImpl的无参构造方法");
	}

	@Override
	public void doSome() {
		System.out.println("执行SomeServiceImpl的doSome()方法");
	}

}
