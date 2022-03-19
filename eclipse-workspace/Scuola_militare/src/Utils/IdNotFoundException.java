package Utils;

public class IdNotFoundException extends RuntimeException {

	public IdNotFoundException() {


	}

	public IdNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}

}

