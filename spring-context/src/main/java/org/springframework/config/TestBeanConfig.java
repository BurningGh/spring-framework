package org.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/6
 */
@Configuration
@EnableAspectJAutoProxy()
@ComponentScan(value = "org.springframework.config")
public class TestBeanConfig {
	@Bean
	public RoleDO roleDO(){
		return new RoleDO();
	}

	@Bean
	public UserDO userDO(){
		return new UserDO();
	}

	@Bean("userRoleDO")
	public UserRoleDO ussrRoleDO( UserDO userDO,RoleDO roleDO){
		return new UserRoleDO(userDO,roleDO);
	}
}
