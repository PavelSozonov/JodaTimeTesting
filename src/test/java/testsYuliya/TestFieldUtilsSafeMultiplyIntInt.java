package testsYuliya;

import org.joda.time.field.FieldUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFieldUtilsSafeMultiplyIntInt extends TestCase {
	
    public static TestSuite suite() {
        return new TestSuite(TestFieldUtilsSafeMultiplyIntInt.class);
    }
	
	public void testBoundaries1(){
		try {
			FieldUtils.safeMultiply(2147483647,2147483647);	
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	public void testBoundaries2(){
		try {
			FieldUtils.safeMultiply(-2147483647,2147483647);	
			fail();
		} catch (ArithmeticException e) {
		}
	}
	
	
	public void testBoundaries3(){
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		try {
			long totalMin = FieldUtils.safeMultiply(-1073741825,2);	
			long totalMax = FieldUtils.safeMultiply(1073741824,2);	
			assertTrue(totalMax <= maxInt);
			assertTrue(totalMin >= minInt);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	

	public void testBoundaries4(){
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		long totalMin = FieldUtils.safeMultiply(-2147483646,1);	
		long totalMax = FieldUtils.safeMultiply(2147483646,1);	
		assertTrue(totalMax <= maxInt);
		assertTrue(totalMin >= minInt);
	}
	

	public void testBoundaries5(){
		int maxInt = Integer.MAX_VALUE;
		int total = FieldUtils.safeMultiply(2147483647,1);
		assertTrue(total <= maxInt);
	}
	

	public void testBoundaries6(){
		int minInt = Integer.MIN_VALUE;				
		int total = FieldUtils.safeMultiply(-2147483648,1);
		assertTrue(total >= minInt);
	}
	

	public void testBoundaries7(){
		try {
			int maxInt = Integer.MAX_VALUE;
			long totalMax = FieldUtils.safeMultiply(1073741824,2);	
			assertTrue(totalMax <= maxInt);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	
	

	public void testBoundaries8(){
		try {
			int minInt = Integer.MIN_VALUE;
			long totalMin = FieldUtils.safeMultiply(-715827883,3);	
			assertTrue(totalMin >= minInt);
			fail();
		} catch (ArithmeticException e) {
		}

	}
	

	public void testIntegerReplaced(){
		long total = FieldUtils.safeMultiply(5,6);	
		assertTrue(total == 30);
	}
}
