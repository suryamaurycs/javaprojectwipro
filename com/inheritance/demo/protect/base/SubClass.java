package com.inheritance.demo.protect.base;

public class SubClass extends SuperClass{
	public void accessProtected() {
		protectedField = 10;
		protectedMethod();
	}
}
