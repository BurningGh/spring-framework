package org.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/9
 */
@Component
public class ADO {

	private Map<String,String> map=new HashMap<>();

	{
		System.out.println("map 初始化");
		map.put("a","a");
	}

	@Autowired
	private BDO bdo;

	String getA(){
		return "a String";
	}

	public ADO() {
		System.out.println("调用ADO 构造器");
	}

	@PostConstruct
	public void inint(){
		System.out.println("PostConstruct 初始化");
	}
}
