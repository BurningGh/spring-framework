package org.springframework.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/6
 */
public class TestApplication {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(TestBeanConfig.class);
		UserRoleDO userRoleDO =(UserRoleDO)annotationConfigApplicationContext.getBean("userRoleDO");
		BDO b =(BDO)annotationConfigApplicationContext.getBean("bDO");
		System.out.println(b.getB());

		System.out.println(userRoleDO.getNameAndRoleName1("a"));

		System.out.println(userRoleDO.getNameAndRoleName());

	}
}
