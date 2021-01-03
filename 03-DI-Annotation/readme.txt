ch04-DI-Annotation: 通过spring的注解完成java对象的创建，属性。代替xml文件

注解的使用步骤
	1)在pom.xml中加入Maven依赖spring-context
		*加入spring-context依赖的同时,间接加入spring-aop的依赖
		*使用注解必须使用spring-aop依赖
	2)在类中加入Spring注解[多个不同功能的注解]
	3)在Spring配置文件中,配置组件扫描器[component-scan],来表明注解的项目位置
		*组件就是java对象
	3)使用注解创建对象,创建容器ApplicationContext

ba01:使用注解实现创建对象
ba02:使用注解实现对象的简单类型赋值
ba03:使用注解实现对象的引用类型赋值[@Autowired的byType]
ba04:使用注解实现对象的引用类型赋值[@Autowired的byName]
ba05:使用注解实现对象的引用类型赋值[@Autowired的required属性]
ba06:使用注解实现对象的引用类型赋值[@Resouce]
ba07:使用注解实现对象的引用类型赋值[@Resouce的byName]