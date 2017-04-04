package testsYuliya;

import org.joda.time.format.PeriodFormatterBuilder;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestPeriodFormatterBuilder extends TestCase {
	
	public static TestSuite suite() {
        return new TestSuite(TestPeriodFormatterBuilder.class);
    }
	

	public void test1 () {
		PeriodFormatterBuilder p = new PeriodFormatterBuilder();
		PeriodFormatterBuilder p2 = p.maximumParsedDigits(2);
		assertEquals(p, p2);
	}
	
	public void test2 () {
		PeriodFormatterBuilder p = new PeriodFormatterBuilder();
		PeriodFormatterBuilder p2 = p.rejectSignedValues(true);
		assertEquals(p, p2);
	}
	
	public void test3 () {
		try {
			PeriodFormatterBuilder p = new PeriodFormatterBuilder();
			String[] regularExpressions = new String[0];
			String[] prefixes = new String[2];
			p.appendPrefix(regularExpressions, prefixes);
			fail();
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	public void test4 () {
		PeriodFormatterBuilder p = new PeriodFormatterBuilder();
		String[] regularExpressions = new String[1];
		regularExpressions[0] = "r";
		String[] prefixes = new String[1];
		prefixes[0] = "a";
		PeriodFormatterBuilder pRes = p.appendPrefix(regularExpressions, prefixes);
		assertFalse(pRes.equals(null));

	}
	
	public void test5() {
		try {
			PeriodFormatterBuilder p = new PeriodFormatterBuilder();
			String[] regularExpressions = new String[1];
			regularExpressions[0] = "t";
			String[] prefixes = new String[1];
			prefixes[0] = "a";
			PeriodFormatterBuilder pRes = p.appendSuffix(regularExpressions, prefixes);
			fail();
		} catch (IllegalStateException e) {
		
		}

	}	

}
