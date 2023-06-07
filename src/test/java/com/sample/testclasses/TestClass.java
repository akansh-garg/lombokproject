package com.sample.testclasses;

import org.testng.annotations.Test;

import com.sample.bean.Student;

public class TestClass {

	@Test
	public void test() {
		Student student = new Student(1,"ansh","pcb");
		System.out.println(student.getName());
	}
}
