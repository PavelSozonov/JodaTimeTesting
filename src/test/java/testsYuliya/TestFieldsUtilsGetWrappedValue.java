package testsYuliya;

import org.joda.time.field.FieldUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFieldsUtilsGetWrappedValue extends TestCase{
	
    public static TestSuite suite() {
        return new TestSuite(TestFieldsUtilsGetWrappedValue.class);
    }
	
	public void test1(){
		try {
			FieldUtils.getWrappedValue(5, 9, 9);
			fail();
		} catch (IllegalArgumentException e){}
	}
	
	public void test2(){
		try {
			FieldUtils.getWrappedValue(5, 10, 9);
			fail();
		} catch (IllegalArgumentException e){}
	}
	
	public void test3(){
		FieldUtils.getWrappedValue(5, 8, 9);
	}
	
	public void test4(){
		FieldUtils.getWrappedValue(5, 8, 9);
	}
	

	public void test5(){
		int res = FieldUtils.getWrappedValue(0, 0, 1);
		assertTrue(res == 0);
	}
	
	public void test6(){
		int res = FieldUtils.getWrappedValue(-1, 0, 1);
		assertTrue(res == 1);
	}
	

	public void test7(){
		int res = FieldUtils.getWrappedValue(1, 0, 1);
		assertTrue(res == 1);
	}
	

	public void test8(){
		int res = FieldUtils.getWrappedValue(-2, 0, 1);
		assertTrue(res == 0);
	}
	

	public void test9(){
		int res = FieldUtils.getWrappedValue(-10, 2, 3);
		assertTrue(res == 2);
	}
	
	public void test10(){
		int res = FieldUtils.getWrappedValue(5, 5, 10);
		assertTrue(res == 5);
	}
	

	public void test11(){
		int res = FieldUtils.getWrappedValue(4, 5, 10);
		assertTrue(res == 10);
	}
	

	public void test12(){
		int res = FieldUtils.getWrappedValue(6, 5, 10);
		assertTrue(res == 6);
	}
}
