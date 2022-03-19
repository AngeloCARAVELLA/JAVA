package Utils;

public class ErrorNotFoundInformation extends RuntimeException  {

	public ErrorNotFoundInformation() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ErrorNotFoundInformation(String message) {
		// TODO Auto-generated constructor stub

		super(message);
		System.out.println(message);
	}

}
