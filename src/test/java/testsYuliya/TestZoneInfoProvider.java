package testsYuliya;

import java.io.IOException;
import org.joda.time.tz.ZoneInfoProvider;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestZoneInfoProvider extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestZoneInfoProvider.class);
    }
	

	public void test1 () {
		ClassLoader loader = null;
		String resPath = "testFile";
		try {
			ZoneInfoProvider z = new ZoneInfoProvider(resPath, loader);
			fail();
		} catch (IOException e) {
			String ex = e.toString();
			assertTrue(ex.contains("Resource not found:"));
			assertTrue(ex.contains(resPath));
			assertTrue(ex.contains("ClassLoader"));
		}
	}

	

}
