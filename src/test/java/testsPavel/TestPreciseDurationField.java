/**
 * 
 */
package testsPavel;

import static org.junit.Assert.assertEquals;

import org.joda.time.DurationFieldType;
import org.joda.time.field.PreciseDurationField;
import org.junit.Test;

/**
 * 
 * @author Pavel Sozonov
 */
public class TestPreciseDurationField {

	@Test
	public void testGetDifferenceAsLong() {
		DurationFieldType type = DurationFieldType.millis();
		PreciseDurationField pdf = new PreciseDurationField(type, 1);
		long difference = pdf.getDifferenceAsLong(1, 1);
		assertEquals(0, difference);
	}
}
