package testsYuliya;

import java.util.Map;

import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDateTimeUtilsBuildDefaultTimeZoneNames extends TestCase{
    
	public static TestSuite suite() {
        return new TestSuite(TestDateTimeUtilsBuildDefaultTimeZoneNames.class);
    }
	
	public void test1(){		
		Map<String, DateTimeZone> m = DateTimeUtils.buildDefaultTimeZoneNames();
		assertNotNull(m.get("EST"));
		assertNotNull(m.get("EDT"));
		assertNotNull(m.get("CST"));
		assertNotNull(m.get("CDT"));
		assertNotNull(m.get("MST"));
		assertNotNull(m.get("MDT"));
		assertNotNull(m.get("PST"));
		assertNotNull(m.get("PDT"));

	}
	


}
