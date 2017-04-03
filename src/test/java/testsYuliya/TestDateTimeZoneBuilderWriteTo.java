package testsYuliya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.joda.time.tz.DateTimeZoneBuilder;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDateTimeZoneBuilderWriteTo extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestDateTimeZoneBuilderWriteTo.class);
    }
	
	public void test1 () {
		DateTimeZoneBuilder dtzb = new DateTimeZoneBuilder();
		OutputStream out;
		try {
			out = new FileOutputStream(new File("testFile"));
			dtzb.writeTo("1", out) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
