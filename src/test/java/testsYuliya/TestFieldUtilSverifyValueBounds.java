package testsYuliya;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.FieldUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFieldUtilSverifyValueBounds extends TestCase{
	
    public static TestSuite suite() {
        return new TestSuite(TestFieldUtilSverifyValueBounds.class);
    }
	
	public void test2(){
		try {
			String fName = null;
			FieldUtils.verifyValueBounds(fName, 0, 2, 5);
		fail();
		} catch (IllegalFieldValueException e) {
			
		}	
	
	}
	
	public void test3(){
		String fName = null;
		FieldUtils.verifyValueBounds(fName, 2, 2, 5);
	}
	
	public void test4(){
		String fName = null;
		FieldUtils.verifyValueBounds(fName, 5, 2, 5);
	}
}
