package MoodAnalyser2;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {


	//Test case for Sad Mood
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood"); //passed message to constructor
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	//Test case for Sad Mood
	@Test
	public void givenMessage_whenNotSad_shouldReturn_Happy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood"); //passed message to constructor
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
}