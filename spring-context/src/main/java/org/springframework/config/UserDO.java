package org.springframework.config;

import org.springframework.stereotype.Component;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/6
 */
//@Component
public class UserDO {
	String getName(){
		return "user name";
	}

	void sayHello(){
		System.out.println("hello,user");
	}


}
