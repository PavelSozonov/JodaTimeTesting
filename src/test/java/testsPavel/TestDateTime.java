package testsPavel;

import static org.junit.Assert.assertTrue;
import org.joda.time.DateTime;
import org.junit.Test;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Pavel Sozonov
 */
public class TestDateTime {

	@Test
	public void testWithTimeAtStartOfDay() {
		DateTime dateTime = new DateTime();
		assertTrue(dateTime.withTimeAtStartOfDay().toString().contains("00:00.000"));
	}

}
