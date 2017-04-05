import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.field.PreciseDurationField;

/**
 * @author Pavel Sozonov
 */
public class DriverPavel extends DelegatedDurationField {

	/**
	 * @param field
	 */
	protected DriverPavel(DurationField field) {
		super(field);
	}

	// Class DecoratedDurationField
	private static void testGetDifferenceAsLong1() {
		DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
		DurationField field = ISOChronology.getInstance(paris).millis();
		DurationFieldType type = DurationFieldType.millis();
		DecoratedDurationField ddf = new DecoratedDurationField(field, type);
		ddf.getDifferenceAsLong(1, 1);
	}

	// Class PreciseDurationField
	private static void testGetDifferenceAsLong2() {
		DurationFieldType type = DurationFieldType.millis();
		PreciseDurationField pdf = new PreciseDurationField(type, 1);
		pdf.getDifferenceAsLong(1, 1);
	}

	// Class AssembledChronology
	private static void testGetDateTimeMillis() {
		DateTimeZone zone = DateTimeZone.forID("UTC");
		AssembledChronology ac = ISOChronology.getInstance(zone);
		int year = 0;
		int month = 0;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	// Class DelegatedDurationField
	private static void testGetDifferenceAsLong3() {
		DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
		DurationField field = ISOChronology.getInstance(paris).millis();
		DelegatedDurationField ddf = new DriverPavel(field);
		ddf.getDifferenceAsLong(1, 1);
	}

	public static void main(String[] args) {
		testGetDifferenceAsLong1();
		testGetDifferenceAsLong2();
		testGetDateTimeMillis();
		testGetDifferenceAsLong3();
	}

}
