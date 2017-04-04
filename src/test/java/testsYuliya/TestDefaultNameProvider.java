package testsYuliya;

import java.util.Locale;

import org.joda.time.tz.DefaultNameProvider;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDefaultNameProvider extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestDefaultNameProvider.class);
    }
	

	public void test1 () {
		DefaultNameProvider d = new DefaultNameProvider();
		String nameKey = "6";
		String id = "2";
		Locale locale = Locale.ENGLISH;
		d.getName(locale, id, nameKey);
		String res = d.getName(locale, id, nameKey);
		assertEquals(null , res);
	}
	

}
