package edu.kh.inheritance.model.dto.복습;

public class Child1 extends Parent {
	
	private String car;
	
	public Child1() {
		super();
		System.out.println("Child1() 기본 생성자로 자식 객체 생성");
	}
	
	public Child1(String car) {
		super();
		
		this.car = car;
		System.out.println("Child1(String) 매개변수 생성자로 자식 객체 생성");
	}
	
	
	
	

}
