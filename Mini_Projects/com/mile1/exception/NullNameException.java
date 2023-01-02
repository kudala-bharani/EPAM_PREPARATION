package com.mile1.exception;

public class NullNameException extends Exception {
	public NullNameException(String s) {
		super(s);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name is null";
	}
}
