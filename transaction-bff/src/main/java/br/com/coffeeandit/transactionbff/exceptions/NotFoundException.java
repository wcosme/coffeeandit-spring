package br.com.coffeeandit.transactionbff.exceptions;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5154578061307779584L;

	public NotFoundException(String message) {
        super(message);
    }

}
