ch02-DI-XML:在Spring的配置文件中,给java对象的属性赋值。
1.DI依赖注入:表示创建对象,给属性赋值

2.DI的实现方式
	1)基于XML的DI实现:	在Spring配置文件中使用标签和属性完成属性赋值
	2)基于注解的DI实现:	在Java代码中使用Spring注解完成属性赋值

3.DI的语法分类
	1)Set注入/设值注入	Spring调用类的setter()方法,在setter()方法中实现属性赋值。
	2)构造注入			Spring调用类的有参数构造方法创建对象,在构造方法中完成赋值

ba01:set注入[简单类型]
ba02:set注入[引用类型]
ba03:构造注入
ba04:引用类型的自动注入byName
ba05:引用类型的自动注入byType
ba06:包含关系的配置文件