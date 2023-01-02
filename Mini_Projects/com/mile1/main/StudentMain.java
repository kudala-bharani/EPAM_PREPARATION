package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	public static Student data[] = new Student[4];
	
	public StudentMain() {
		for(int i=0;i<data.length;i++) {
			data[i] = new Student();
		}
		data[0] = new Student("Sekhar",new int[] {85,76,95});
		data[1] = new Student(null, new int[] {11,22,330});
		data[2] = null;
		data[3] = new Student("Manoj",null);
	}
	
	public static void main(String[] args) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		// TODO Auto-generated method stub
		StudentMain sm = new StudentMain();
		StudentReport sr = new StudentReport();
		String str = "";
		for(int i=0;i<4;i++) {
			str = sr.validate(data[i]);
			if(str.equals("VALID")) {
				System.out.println(sr.findGrades(data[i]));
			}
		}
		StudentService ss = new StudentService();
		
		int nullmarks = ss.findNumberOfNullMarksArray(data);
		System.out.println("Null Marks Count : "+nullmarks);
		int nullname = ss.findNumberOfNullName(data);
		System.out.println("Null Name count : "+nullname);
		int nullobject = ss.findNumberOfNullObjects(data);
		System.out.println("Null Object count : "+nullobject);
		
	}

}
