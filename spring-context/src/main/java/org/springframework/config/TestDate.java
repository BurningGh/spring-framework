package org.springframework.config;

import java.util.Date;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/10
 */
public class TestDate {

	private int count = 0;

	public static void main(String[] args) {
		TestDate testDate = new TestDate();
		testDate.test1();
		System.out.println("test5 is "+run());
	}

	public void test1(){
		Date date = new Date();
		String name1 = "wangerbei";
		test2(date,name1);
		System.out.println(date+name1);
	}

	public void test2(Date dateP,String name2){
		dateP = null;
		name2 = "zhangsan";
	}

	public void test3(){
		count++;
	}

	public void  test4(){
		int a = 0;
		{
			int b = 0;
			b = a+1;
		}
		int c = a+1;
	}

	public static int add(){
		int i = 100;
		try{
			return i;
		}finally {
			i++;
//			return i;
		}
	}

	public static int run(){
		int a = 0;
		try{
			a = 2;
			return a;
		}
		finally{
			System.out.println("It is in final chunk.");
			a++;
//			return a;
		}
	}
}
