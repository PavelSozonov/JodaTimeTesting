package testsPavel;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DelegatedDurationField;
import org.junit.Test;

/**
 * This class is a Junit unit test for DelegatedDurationField.
 *
 * @author Pavel Sozonov
 */
public class TestDelegatedDurationField {

	private class ExtDelegatedDurationField extends DelegatedDurationField {
		protected ExtDelegatedDurationField(DurationField field) {
			super(field);
		}
	}

	@Test
	public void testWithTimeAtStartOfDay() {
		DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
		DurationField field = ISOChronology.getInstance(paris).millis();
		DelegatedDurationField ddf = new ExtDelegatedDurationField(field);
		long difference = ddf.getDifferenceAsLong(1, 1);
		assertEquals(0, difference);
	}

}
