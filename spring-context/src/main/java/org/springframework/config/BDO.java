package org.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/9
 */
@Component(value = "bDO")
public class BDO {

	@Autowired
	private ADO ado;

	String getB(){
		return "B String";
	}
}
