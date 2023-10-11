package hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String s) {
		super();
	}
	
	public ResourceNotFoundException() {
		super("Resources not found!!!");
	}

}
