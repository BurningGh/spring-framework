package org.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/6
 */
//@Component
public class UserRoleDO {
//	@Autowired
	private UserDO userDO;

//	@Autowired
	private RoleDO roleDO;

	@TestAnnotation("UserRoleDO.getNameAndRoleName")
	String getNameAndRoleName(){
		return userDO.getName()+roleDO.getRoleName();
	}

	String getNameAndRoleName1 (String a) throws Exception{
		if(a.equals("a")){
			System.out.println(this.getClass().getName());
//			throw new RuntimeException("测试异常");
		}
		return userDO.getName()+roleDO.getRoleName();
	}


	public UserRoleDO(UserDO userDO, RoleDO roleDO) {
		this.userDO = userDO;
		this.roleDO = roleDO;
	}
}
