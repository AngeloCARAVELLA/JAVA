package Utils;

public class ExNotFoundException extends RuntimeException {

	public ExNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public ExNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		System.out.println(message);
	}

}
