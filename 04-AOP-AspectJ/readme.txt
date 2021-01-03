Spring-04-AOP-AspectJ:使用AspectJ框架实现AOP
ba01:前置通知
ba02:后置通知
ba03:环绕通知
ba04:异常通知
ba05:最终通知
ba06:@PointCut
ba07:没有接口时,AspectJ自动使用CGLIB动态代理
ba08:存在接口时,AspectJ手动使用CGLIB动态代理

使用AspectJ框架实现AOP的基本步骤：
第一步:新建maven项目
第二步:加入依赖
	1)spring依赖
	2)aspectj依赖
	3)junit单元测试
第三步:创建目标类[接口及其实现类]
第四步:创建切面类[普通类]
	1)在类的上面加入 @Aspect
		@Aspect是AspectJ框架的注解
			作用：表示当前类是切面类
			位置：在类定义的上面
	2)在类中定义方法[切面要执行的功能代码]
		方法的定义要求:
			*公共方法,即public
			*无返回值,即void
			*方法参数只需要参数类型
	3)在方法的上面指定AspectJ中的通知注解
	4)在方法的上面指定切入点表达式execution()
 
第五步:创建spring的配置文件,在配置文件中声明对象
	1)声明目标对象
	2)声明切面类对象
	3)声明AspectJ框架中的自动代理生成器标签[完成代理对象的自动创建]
	*声明对象可以使用AspectJ的注解或者XML配置文件<bean>
 
第六步:创建测试类
	1)从Spring容器中获取目标对象（实际就是代理对象）。
  	3)通过代理对象执行方法,实现AOP的功能增强