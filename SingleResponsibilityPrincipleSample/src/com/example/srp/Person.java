package com.example.srp;


/**
 * 
 * @author AlenPan
 * 
 * 单一职责原则（Single Responsibility Principle）：
 * There should never be more than one reason for a class to change.
 * 应该有且仅有一个原因引起类的变更。
 * 
 * 单一职责原则告诉我们：一个类不能太“累”！在软件系统中，一个类（大到模块，小到方法）承担的职责越多，它
 * 被复用的可能性就越小，而且一个类承担的职责过多，就相当于将这些职责耦合在一起，当其中一个职责变化时，
 * 可能会影响其他职责的运作，因此要将这些职责进行分离，将不同的职责封装在不同的类中，即将不同的变化原因封
 * 装在不同的类中，如果多个职责总是同时发生改变则可将它们封装在同一类中。
 * 
 * 单一职责原则的好处：
 * 1。降低类的复杂性，实现什么样的职责都有清晰的定义
 * 2.提高可读性
 * 3。提高可维护性
 * 4.降低变更引起的风险，对系统扩展性和维护性很有帮助
 * 
 * 所以，按照单一职责原则，下面的Person类要把业务对象和业务逻辑分离。
 */
public class Person {

	// name和age属于业务对象
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// changeName和changeAge属于业务逻辑
	public void changeName(String name) {
		
	}
	
	public void changeAge(int age) {
		
	}
}
