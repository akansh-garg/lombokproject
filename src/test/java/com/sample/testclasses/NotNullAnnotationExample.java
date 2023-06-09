package com.sample.testclasses;

import org.testng.annotations.Test;

import com.sample.bean.Student;

import lombok.NonNull;

public class NotNullAnnotationExample {

	@Test
	public void testNotNullAnnotation() {
		System.out.println(getStudentId(null));
	}
	
	
	private int getStudentId(@NonNull Student student) {
		return student.getId();
	}
}
