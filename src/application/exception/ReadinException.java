package application.exception;

import java.io.IOException;

public class ReadinException extends IOException{

	
	private static final long serialVersionUID = 1L;
	
	public ReadinException(String msg) {
		super(msg);
	}

}
