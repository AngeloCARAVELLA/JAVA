package Utils;

public class FreshNotFoundException extends RuntimeException{

	public FreshNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public FreshNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		System.out.println(message);
	}
}
