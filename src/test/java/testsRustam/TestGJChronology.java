package testsRustam;

import org.joda.time.YearMonthDay;
import org.joda.time.chrono.GJChronology;
import org.junit.Test;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

public class TestGJChronology extends TestCase{
	
	private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
	
	public static TestSuite suite() {
        return new TestSuite(TestGJChronology.class);
    }

	@Test
    public void test1() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
	}
	
	@Test
    public void test2() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
        assertEquals("February", new YearMonthDay("2005-02-01", chrono).monthOfYear().getAsText());
   }
	
	@Test
    public void test3() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
        assertEquals("Feb", new YearMonthDay("2005-02-01", chrono).monthOfYear().getAsShortText());
	}
	
	@Test
    public void test4() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
        assertEquals("March", new YearMonthDay("2005-03-01", chrono).monthOfYear().getAsText());
        assertEquals("Mar", new YearMonthDay("2005-03-01", chrono).monthOfYear().getAsShortText());
   }
	
	@Test
    public void test5() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);

        assertEquals("April", new YearMonthDay("2005-04-01", chrono).monthOfYear().getAsText());
        assertEquals("Apr", new YearMonthDay("2005-04-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("May", new YearMonthDay("2005-05-01", chrono).monthOfYear().getAsText());
        assertEquals("May", new YearMonthDay("2005-05-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("June", new YearMonthDay("2005-06-01", chrono).monthOfYear().getAsText());
        assertEquals("Jun", new YearMonthDay("2005-06-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("July", new YearMonthDay("2005-07-01", chrono).monthOfYear().getAsText());
        assertEquals("Jul", new YearMonthDay("2005-07-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("August", new YearMonthDay("2005-08-01", chrono).monthOfYear().getAsText());
        assertEquals("Aug", new YearMonthDay("2005-08-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("September", new YearMonthDay("2005-09-01", chrono).monthOfYear().getAsText());
        assertEquals("Sep", new YearMonthDay("2005-09-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("October", new YearMonthDay("2005-10-01", chrono).monthOfYear().getAsText());
        assertEquals("Oct", new YearMonthDay("2005-10-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("November", new YearMonthDay("2005-11-01", chrono).monthOfYear().getAsText());
        assertEquals("Nov", new YearMonthDay("2005-11-01", chrono).monthOfYear().getAsShortText());
        
        assertEquals("December", new YearMonthDay("2005-12-01", chrono).monthOfYear().getAsText());
        assertEquals("Dec", new YearMonthDay("2005-12-01", chrono).monthOfYear().getAsShortText());
    }
	
	
	

}
