package testsYuliya;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.FieldUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFieldUtilsSafeMultiplyToInt extends TestCase{
	
    public static TestSuite suite() {
        return new TestSuite(TestFieldUtilsSafeMultiplyToInt.class);
    }
	
	public void test1(){
		 int res = FieldUtils.safeMultiplyToInt(5232L, 2L);
		 assertFalse(res == 0);
		 assertFalse(res == 1);
	}
	
	}
