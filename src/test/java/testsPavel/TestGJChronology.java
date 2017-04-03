package testsPavel;

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

/**
 * This class is a Junit unit test for AssembledChronology.
 *
 * @author Pavel Sozonov
 */
public class TestGJChronology {

	@Test
	public void testWithTimeAtStartOfDay1() {
		// Fail if (ms < 0)
		int year = 0;
		int month = 0;
		int day = 0;
		int ms = -1;
		//ac.getDateTimeMillis(year, month, day, ms);
	}
}

