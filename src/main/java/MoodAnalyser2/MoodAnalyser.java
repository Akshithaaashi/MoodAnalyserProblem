package MoodAnalyser2;

public class MoodAnalyser {
	/**
     * Ability to check the given string in the given message
     * @param message
     * @return HAPPY or SAD
     */
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

}