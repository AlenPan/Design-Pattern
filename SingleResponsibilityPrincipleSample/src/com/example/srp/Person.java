package com.example.srp;


/**
 * 
 * @author AlenPan
 * 
 * ��һְ��ԭ��Single Responsibility Principle����
 * There should never be more than one reason for a class to change.
 * Ӧ�����ҽ���һ��ԭ��������ı����
 * 
 * ��һְ��ԭ��������ǣ�һ���಻��̫���ۡ��������ϵͳ�У�һ���ࣨ��ģ�飬С���������е���ְ��Խ�࣬��
 * �����õĿ����Ծ�ԽС������һ����е���ְ����࣬���൱�ڽ���Щְ�������һ�𣬵�����һ��ְ��仯ʱ��
 * ���ܻ�Ӱ������ְ������������Ҫ����Щְ����з��룬����ͬ��ְ���װ�ڲ�ͬ�����У�������ͬ�ı仯ԭ���
 * װ�ڲ�ͬ�����У�������ְ������ͬʱ�����ı���ɽ����Ƿ�װ��ͬһ���С�
 * 
 * ��һְ��ԭ��ĺô���
 * 1��������ĸ����ԣ�ʵ��ʲô����ְ���������Ķ���
 * 2.��߿ɶ���
 * 3����߿�ά����
 * 4.���ͱ������ķ��գ���ϵͳ��չ�Ժ�ά���Ժ��а���
 * 
 * ���ԣ����յ�һְ��ԭ�������Person��Ҫ��ҵ������ҵ���߼����롣
 */
public class Person {

	// name��age����ҵ�����
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

	// changeName��changeAge����ҵ���߼�
	public void changeName(String name) {
		
	}
	
	public void changeAge(int age) {
		
	}
}
