package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentReport {
	public String findGrades(Student studentObject) {
		int sum = 0;
		for(int i=0;i<studentObject.marks.length;i++) {
			if(studentObject.marks[i] < 35) {
				studentObject.grade = "F";
				return "F";
			} else {
				sum += studentObject.marks[i];
			}
		}
		if(sum < 150) {
			studentObject.grade = "C";
			return "C";
		} else if(sum < 200) {
			studentObject.grade = "B";
			return "B";
		} else if(sum < 250) {
			studentObject.grade = "A";
			return "A";
		} else {
			studentObject.grade = "A+";
			return "A+";
		}
	}
	
	public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		int count = 0;
		if(s == null) {
			count++;
			try {
				throw new NullStudentObjectException("object is null");
			}
			catch(NullStudentObjectException n) {
				n.printStackTrace();
				System.out.println(n.getMessage());
			}
		} else {
			
			if(s.name == null) {
				count++;
				try {
					throw new NullNameException("name is null");
				}
				catch(NullNameException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			} 
			
			if(s.marks == null) {
				count++;
				try {
					throw new NullMarksArrayException("marks array is null");
				}
				catch(NullMarksArrayException nm) {
					nm.printStackTrace();
					System.out.println(nm.getMessage());
				}
			}
			
		}
		if(count == 0) {
			return "VALID";
		} else {
			return "";
		}
	}
	
}
