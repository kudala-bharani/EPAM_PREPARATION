package com.mile1.exception;

public class NullMarksArrayException extends Exception {
	public NullMarksArrayException(String s) {
		super(s);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mark arry is null";
	}
	
}

