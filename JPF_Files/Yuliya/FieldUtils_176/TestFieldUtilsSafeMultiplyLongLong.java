package yuliya.tests;

import org.joda.time.field.FieldUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFieldUtilsSafeMultiplyLongLong extends TestCase {
	

	
    public static TestSuite suite() {
        return new TestSuite(TestFieldUtilsSafeMultiplyLongLong.class);
    }
	
	public void testBoundaries1(){
		try {
			long l1 = Long.MAX_VALUE;
			long l2 = Long.MAX_VALUE;
			FieldUtils.safeMultiply(l1,l2);	
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	public void testBoundaries2(){
		try {
			long l1 = -Long.MIN_VALUE;
			long l2 = Long.MAX_VALUE;
			FieldUtils.safeMultiply(l1,l2);	
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	
	public void testBoundaries3(){
		long maxLong =  Long.MAX_VALUE;
		long minLong =  Long.MIN_VALUE;
		try {
			long l1 = minLong / 2 - 1;
			long l2 = maxLong / 2 + 1 ;
			long totalMin = FieldUtils.safeMultiply(l1,2);	
			long totalMax = FieldUtils.safeMultiply(l2,2);	
			assertTrue(totalMax <= maxLong);
			assertTrue(totalMin >= minLong);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	

	public void testBoundaries4(){
		long l1 = Long.MIN_VALUE + 1;
		long l2 = Long.MAX_VALUE - 1;
		long maxLong =  Long.MAX_VALUE;
		long minLong =  Long.MIN_VALUE;
		long totalMin = FieldUtils.safeMultiply(l1,1);	
		long totalMax = FieldUtils.safeMultiply(l2,1);	
		assertTrue(totalMax <= maxLong);
		assertTrue(totalMin >= minLong);
	}
	

	public void testBoundaries5(){
		long l1 = Long.MAX_VALUE;
		long l2 = 1;
		long maxLong =  Long.MAX_VALUE;
		long total = FieldUtils.safeMultiply(l1,l2);
		assertTrue(total <= maxLong);
	}
	

	public void testBoundaries6(){
		long l1 = Long.MIN_VALUE;
		long l2 = 1;
		long minLong =  Long.MIN_VALUE;			
		long total = FieldUtils.safeMultiply(l1,l2);
		assertTrue(total >= minLong);
	}
	

	public void testBoundaries7(){
		try {
			long l1 = Long.MAX_VALUE / 2 + 1;
			long l2 = 2;
			long maxLong =  Long.MAX_VALUE;
			long totalMax = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(totalMax <= maxLong);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	
	

	public void testBoundaries8(){
		try {
			long minLong = Long.MIN_VALUE;
			long l1 = minLong / 3 - 1;
			long l2 = 3;
			long total = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(total >= minLong);
			System.out.println(minLong + " ," + l1 + " ," + total );
			
			fail();
		} catch (ArithmeticException e) {
		}

	}
	

	public void testIntegerReplaced(){
		long total = FieldUtils.safeMultiply(5,6);	
		assertTrue(total == 30);
	}
	
	
	public void testNegation(){
		try {
			long minLong = Long.MIN_VALUE;
			long l2 = 30L;
			long totalMin = FieldUtils.safeMultiply(minLong,l2);	
			assertTrue(totalMin >= minLong);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	
	public void testNegation1(){
		try {
			long minLong = Long.MIN_VALUE;
			long l1 = minLong;
			long l2 = -1;
			long total = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(total >= minLong);
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	public void testNegation5(){
			long l1 = Long.MIN_VALUE + 1;
			long l2 = -1;
			long totalMin = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(totalMin >= Long.MIN_VALUE);
	}
	
	public void testNegation4(){
			long minLong = Long.MIN_VALUE;
			long l1 = minLong + 1;
			long l2 = -1;
			long total = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(total >= minLong);
	}
	
	public void testNegation51(){
		long l1 = 5666L;
		long l2 = 6L;
		long totalMin = FieldUtils.safeMultiply(l1,l2);	
		assertTrue(totalMin >= Long.MIN_VALUE);
	}

	public void testNegation41(){
		long minLong = Long.MIN_VALUE;
		long l1 = 6L;
		long l2 = 34242342L;
		long total = FieldUtils.safeMultiply(l1,l2);	
		assertTrue(total >= minLong);
	}
	
	public void testNegation2(){
		try {
			long minLong = Long.MIN_VALUE;
			long l1 = -1;
			long l2 = Long.MIN_VALUE;
			long total = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(total >= minLong);
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	
	public void testNegation3(){
		try {
			long l1 = 60L;
			long l2 = Long.MAX_VALUE;
			long total = FieldUtils.safeMultiply(l1,l2);	
			assertTrue(total == l1 * l2);
			assertTrue(l1 == total / l2);
			assertTrue(l2 == total / l1);
			fail();
		} catch (ArithmeticException e) {
		}
	}
	

}
