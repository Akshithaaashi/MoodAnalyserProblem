package MoodAnalyser2;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood"); //passed message to constructor
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	//Test case for Happy Mood
	@Test
	public void givenMessage_whenNotSad_shouldReturn_Happy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood"); //passed message to constructor
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	//Test case for Null
	@Test
	public void givenMessage_whenNull_shouldReturn_Null() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //passed message to constructor
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}