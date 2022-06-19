package br.com.coffeeandit.transactionbff.exceptions;

public class UnauthorizedException extends RuntimeException {

	private static final long serialVersionUID = 9144474398732705340L;
	
	public UnauthorizedException(String message) {
		super(message);
	}

}
