package testsYuliya;

import org.joda.time.DateTimeZone;
import org.joda.time.tz.CachedDateTimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCachedDateTimeZoneForZone extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestCachedDateTimeZoneForZone.class);
    }
	
	public void test1 () {
		DateTimeZone dateTimeZone = DateTimeZone.UTC;
		CachedDateTimeZone cachedDateTimeZone1 = CachedDateTimeZone.forZone(dateTimeZone);
		CachedDateTimeZone cachedDateTimeZone2 = CachedDateTimeZone.forZone(cachedDateTimeZone1);
		assertTrue(cachedDateTimeZone2.equals(cachedDateTimeZone1));
	}
}
