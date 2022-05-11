package com.cg.exception;

public class NoCustomersFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoCustomersFoundException() {
	}

	public NoCustomersFoundException(String msg) {
		super(msg);
	}
}
