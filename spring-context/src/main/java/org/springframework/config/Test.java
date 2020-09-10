package org.springframework.config;

/**
 * @author dengwj3
 * @email wenjian.deng@midea.com
 * @date 2020/7/10
 */
public class Test {

	private String a="a";

	private String b;

	public Test(String b) {
		this.b = b;
	}

	public String getString(){
		return a+b;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public static void main(String[] args) {
		Test test=new Test("b");
		String a=test.getString();
		int i=0;
		int j=i++;
		System.out.println(j);
		System.out.println("result "+a+i);

	}
}
