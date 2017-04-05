/**
 * 
 */
package testsPavel;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.Test;

/**
 * This class is a Junit unit test for ZonedChronology.
 * 
 * @author Pavel Sozonov
 */
public class TestZonedChronology {

	private DateTimeZone zone = DateTimeZone.forID("UTC");
	private Chronology base = IslamicChronology.getInstance(DateTimeZone.UTC);
	private ZonedChronology zc = ZonedChronology.getInstance(base, zone);

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis1() {
		// Fail if (ms < 0)
		int year = 0;
		int month = 1;
		int day = 1;
		int ms = -1;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis2() {
		// Fail if (y < 0)
		int year = -1;
		int month = 1;
		int day = 1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis3() {
		// Fail if (ms >= 0) && (y >= 0) && !(y <= 292271023)
		int year = 292271023 + 1;
		int month = 1;
		int day = 1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis4() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && (mo < 1)
		int year = 1;
		int month = -1;
		int day = 1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis5() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// !(mo <= 12)
		int year = 1;
		int month = 12 + 1;
		int day = 1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis6() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && (((mo + -1) % 2) != 0) && (d < 1)
		int year = 1;
		int month = 10;
		int day = -1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis7() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && (((mo + -1) % 2) != 0) && !(d < 1) && !(d <= 29)
		int year = 1;
		int month = 2;
		int day = 30;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testGetDateTimeMillis8() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && (((mo + -1) % 2) != 0) && !(d < 1) && (d <= 29) &&
		// !('y' <= 292271022)
		int year = 292271022 + 1;
		int month = 2;
		int day = 29;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis9() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && !(((mo + -1) % 2) != 0) && (d < 1)
		int year = 1;
		int month = 3;
		int day = -1;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis10() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && !(((mo + -1) % 2) != 0) && !(d < 1) && !(d <= 30)
		int year = 1;
		int month = 3;
		int day = 32;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testGetDateTimeMillis11() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo < 12) && !(((mo + -1) % 2) != 0) && !(d < 1) && (d <= 30) && !(y
		// <= 292271022)
		int year = 292271022 + 1;
		int month = 3;
		int day = 30;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis12() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo = 12) && ((623191204 & (1 << (y % 30))) <= 0) && (d < 1)
		int year = 1; // ((623191204 & (1 << (year % 30))) <= 0)
		int month = 12;
		int day = 0;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis13() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo = 12) && ((623191204 & (1 << (y % 30))) <= 0) && !(d < 1) && !(d
		// <= 29)
		int year = 1; // ((623191204 & (1 << (year % 30))) <= 0)
		int month = 12;
		int day = 30;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = org.joda.time.IllegalFieldValueException.class)
	public void testGetDateTimeMillis14() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo = 12) && !((623191204 & (1 << (y % 30))) <= 0) && !(d < 1) && !(d
		// <= 30)
		int year = 10000; // !((623191204 & (1 << (year % 30))) <= 0)
		int month = 12;
		int day = 31;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testGetDateTimeMillis15() {
		// Fail if (ms >= 0) && (y >= 0) && (y <= 292271023) && !(mo < 1) &&
		// (mo = 12) && !((623191204 & (1 << (y % 30))) <= 0) && !(d < 1) && (d
		// <= 30) && !(y <= 292271022)
		int year = 292271022 + 1; // !((623191204 & (1 << (year % 30))) <= 0)
		int month = 12;
		int day = 30;
		int ms = 0;
		zc.getDateTimeMillis(year, month, day, ms);
	}

}
