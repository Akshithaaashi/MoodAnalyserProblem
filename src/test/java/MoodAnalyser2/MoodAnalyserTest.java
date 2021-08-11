package MoodAnalyser2;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
	//Test case for Sad Mood
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
		public void givenMessage_whenNull_shouldThrow_MoodAnalysisException() {
			try {
				MoodAnalyser moodAnalyser = new MoodAnalyser(null);
				moodAnalyser.analyseMood();
			} catch (MoodAnalyserException e) {
				Assert.assertEquals("Invalid", e.getMessage());
			}
		}
		
		//Test case for Empty
		@Test
		public void givenMessage_whenEmpty_shouldReturn_Null() {
			try {
				MoodAnalyser moodAnalyser = new MoodAnalyser("");
				moodAnalyser.analyseMood();
			} catch (MoodAnalyserException e) {
				Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			}
		}
	
}
