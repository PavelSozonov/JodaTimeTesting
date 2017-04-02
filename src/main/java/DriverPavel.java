import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

//import org.joda.time.format.FormatUtils;

/**
 * @author Pavel Sozonov
 */
public class DriverPavel {

	/*
	 * public static void run(long millis) { DateTimeZone zone =
	 * DateTimeZone.getDefault(); CachedDateTimeZone cachedDateTimeZone =
	 * CachedDateTimeZone.forZone(zone); cachedDateTimeZone.getNameKey(millis);
	 * }
	 */

	public static void run2() throws IOException {
		OutputStream os = new ByteArrayOutputStream();
		DataOutputStream dout = new DataOutputStream(os);
		DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
		DataOutput dto = dout;
		builder.writeTo("Europe/Moscow", dto);

	}

	// buildFixedZone(String id, String nameKey,
	// int wallOffset, int standardOffset)

	// DividedDateTimeField.java
	// int get(long instant)

	public void run4(long l) {
		// DividedDateTimeField field = new DividedDateTimeField(new
		// DateTimeFieldType());
		// field.get(100);

	}

	// ZeroIsMaxDateTimeField
	public void run5(long instant, int value) {
		// set(long instant, int value)
		// DateTimeField dtf = new DateTimeField();
		// DateTimeFieldType dtft = new DateTimeFieldType();
		// ZeroIsMaxDateTimeField f = new ZeroIsMaxDateTimeField(dtf, dtft);
	}

	public void run3() {
		DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
		builder.toDateTimeZone("Europe/Moscow", true);
	}

	public void run6(int year, int month, int day, int ms) {
		DateTimeZone zone = DateTimeZone.forID("UTC");
		AssembledChronology ac = ISOChronology.getInstance(zone);
		ac.getDateTimeMillis(year, month, day, ms);

	}

	public static void main(String[] args) throws IOException {
		Driver d = new Driver();
		d.run6(2017, 12, 31, 40);
		// System.out.println(DateTimeZone.getAvailableIDs());
	}

}
