package MoodAnalyser2;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {


            @Test
            public void givenMessage_whenSad_ShouldReturn_Sad() {
                MoodAnalyser moodAnalyzer = new MoodAnalyser();
                String actual = moodAnalyzer.analyseMood("I am Sad");
                String expected = "SAD";
                Assert.assertEquals(expected, actual);

            }

            @Test
            public void givenMessage_whenNotSad_ShouldReturn_Happy() {
                MoodAnalyser moodAnalyzer = new MoodAnalyser();
                String actual = moodAnalyzer.analyseMood("I am Happy");
                String expected = "HAPPY";
                Assert.assertEquals(expected, actual);

            }

        }
