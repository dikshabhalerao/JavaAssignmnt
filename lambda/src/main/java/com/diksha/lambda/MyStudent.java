package com.diksha.lambda;

import java.util.ArrayList;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class MyStudent {

	public static void main(String[] args) throws Exception {
		
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(101, "Diksha", 22, "java"));
		students.add(new Student(102, "Tejal", 23, "sql"));
		students.add(new Student(103, "Sakshi", 22, "angular"));
		students.add(new Student(104, "Pinaki", 22, "mongo"));
		Function<Student, String> studentName=(s)->s.getName();

		List<String> studentNames=students.stream().map(studentName).collect(Collectors.toList());

		studentNames.removeIf((s)->s.length()%2!=0);
		//predicate functional interface is used return type is boolean

		studentNames.forEach(e->System.out.println(e));
		// for each method added in java 8

	}

}
