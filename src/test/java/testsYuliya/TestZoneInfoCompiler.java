package testsYuliya;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.joda.time.tz.ZoneInfoCompiler;
import org.joda.time.tz.ZoneInfoLogger;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestZoneInfoCompiler extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestZoneInfoCompiler.class);
    }
	

	public void test1 () {
		String[] s = new String[0];
		try {
			ZoneInfoCompiler.main(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(ZoneInfoLogger.verbose());
	}
	
	public void test2 () {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;
	    System.setOut(ps);
	    String[] s = new String[1];
		s[0] = "-?";
		try {
			ZoneInfoCompiler.main(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.flush();
	    System.setOut(old);
	    
	    System.out.println(baos);
		assertTrue(baos.toString().contains("Usage"));
		assertTrue(baos.toString().contains("where possible options include:"));
		assertTrue(baos.toString().contains("-src <directory>"));
		assertTrue(baos.toString().contains("-dst <directory>"));
		assertTrue(baos.toString().contains("-verbose"));
	}
	

}
