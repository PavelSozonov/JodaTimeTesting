package testsPavel;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DecoratedDurationField;
import org.junit.Test;

/**
 * This class is a Junit unit test for DecoratedDurationField.
 * 
 * @author Pavel Sozonov
 */
public class TestDecoratedDurationField {

	@Test
	public void testGetDifferenceAsLong() {
		DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
		DurationField field = ISOChronology.getInstance(paris).millis();
		DurationFieldType type = DurationFieldType.millis();
		DecoratedDurationField ddf = new DecoratedDurationField(field, type);
		long difference = ddf.getDifferenceAsLong(1, 1);
		assertEquals(0, difference);
	}
}
