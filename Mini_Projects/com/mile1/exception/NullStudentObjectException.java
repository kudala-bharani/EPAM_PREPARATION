package com.mile1.exception;

public class NullStudentObjectException extends Exception {
	
	public NullStudentObjectException(String msg) {
		super(msg);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "object is null";
	}
}
