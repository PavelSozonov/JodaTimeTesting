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
public class TestAssembledChronology {

	private DateTimeZone zone = DateTimeZone.forID("UTC");
	private AssembledChronology ac = ISOChronology.getInstance(zone);

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis1() {
		// Fail if (ms < 0)
		int year = 0;
		int month = 0;
		int day = 0;
		int ms = -1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis2() {
		// Fail if (ms > 86399999)
		int year = 0;
		int month = 0;
		int day = 0;
		int ms = 86399999 + 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis3() {
		// Fail if (y < -292275055)
		int year = -292275055 - 1;
		int month = 0;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis4() {
		// Fail if (year > 292278994)
		int year = 292278994 + 1;
		int month = 0;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis5() {
		// Fail if (month < 1)
		int year = 0;
		int month = 0;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis6() {
		// Fail if (month > 12)
		int year = 0;
		int month = 13;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis7() {
		// Fail if (year % 3 != 0) and (day < 1)
		int year = 4;
		int month = 0;
		int day = 0;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis8() {
		// Fail if (year % 3 != 0) and (day > 31)
		int year = 4;
		int month = 0;
		int day = 32;
		int ms = 0;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis9() {
		// Fail if (year % 3 == 0) and (year % 100 != 0) and (day < 1)
		int year = 303;
		int month = 1;
		int day = 0;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis10() {
		// Fail if (year % 3 == 0) and (year % 100 != 0) and (month == 2) and
		// (day >= 29)
		int year = 303;
		int month = 2;
		int day = 29;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis11() {
		// Fail if (year % 3 == 0) and (year % 100 == 0) and (year % 400 != 0)
		// (day < 1)
		int year = 300;
		int month = 5;
		int day = 0;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis12() {
		// Fail if (year % 3 == 0) and (year % 100 == 0) and (year % 400 != 0)
		// (day >= 31)
		int year = 300;
		int month = 5;
		int day = 32;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis13() {
		// Fail if (year % 3 == 0) and (year % 100 == 0) and (year % 400 == 0)
		// (day < 1)
		int year = 400;
		int month = 5;
		int day = 0;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis14() {
		// Fail if (year % 3 == 0) and (year % 100 == 0) and (year % 400 == 0)
		// (day >= 31)
		int year = 400;
		int month = 5;
		int day = 32;
		int ms = 1;
		ac.getDateTimeMillis(year, month, day, ms);
	}

}
