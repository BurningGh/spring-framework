package org.springframework.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/10
 */
@Aspect
@Component
public class TestAspect {

	@Pointcut(value = "@annotation(org.springframework.config.TestAnnotation)")
	public void testAnnotation(){
	}

	@Around(value = "testAnnotation()")
	public Object aroundAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		MethodSignature signature = (MethodSignature)proceedingJoinPoint.getSignature();
		printStr("begin aroundAspect"+signature.getMethod().getName());
		Object result=proceedingJoinPoint.proceed();
		printStr("end aroundAspect");
		return result;
	}
	void printStr(String content){
		System.out.println(content);
	}



}
