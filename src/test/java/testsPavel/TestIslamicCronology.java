package testsPavel;

import static org.junit.Assert.assertEquals;

import org.joda.time.chrono.AccessorIslamicChronology;
import org.junit.Test;

/**
 * This class is a Junit unit test for IslamicCronology.
 * 
 * @author Pavel Sozonov
 */
public class TestIslamicCronology {
	@Test
	public void testGetYearDifference() {
		long result = AccessorIslamicChronology.getYearDifference(1, 1);
		assertEquals(result, 0);
	}
}
