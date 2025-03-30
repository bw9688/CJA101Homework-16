package hw6;

public class CalException extends RuntimeException {
	
	public CalException() {
		super("設定錯誤");
	}
	
	public CalException(String message) {
		super(message);
	}

}
