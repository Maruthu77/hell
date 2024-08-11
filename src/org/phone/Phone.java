package org.phone;

public class Phone {
	public void phoneInfo(int id) {
		System.out.println(id);
	}
	public void phoneInfo(String name) {
		System.out.println(name);
	}
	public void phoneInfo(boolean a,int mark) {
		System.out.println(a+"\n"+mark);
	}
	public void PhoneInfo(float mark,int id) {
		System.out.println(mark);
		System.out.println(id);
	}
	public void phoneInfo(char b,double i) {
		System.out.println(b+"\t"+i);
	}
	public static void main(String[] args) {
		Phone ph=new Phone();
		ph.phoneInfo(123);
		ph.phoneInfo("maruthu");
		ph.phoneInfo(true, 12);
		ph.phoneInfo('a',5);
		ph.PhoneInfo(13, 15);
	
		
	}
		
		
	
	
	

}

