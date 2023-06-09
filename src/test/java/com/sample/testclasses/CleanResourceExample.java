package com.sample.testclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

import lombok.Cleanup;

public class CleanResourceExample {

	@Test
	public void cleanAnnotationUsage() throws IOException {

		@Cleanup BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/cleanAnnotationTestData.txt")));
		String value = "";
		while((value=br.readLine())!=null) {
			System.out.println(value);
		}

	}
}
