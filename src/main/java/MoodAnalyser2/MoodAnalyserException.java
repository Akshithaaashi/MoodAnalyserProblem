package MoodAnalyser2;

public class MoodAnalyserException extends Exception {

	private String message;
	public ExceptionType exceptionType;

	public String getMessage() {
		return message;
	}
	
	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY;
	}

	public MoodAnalyserException(String message,ExceptionType type) {
		this.message = message;
		this.exceptionType=type;
	}

}