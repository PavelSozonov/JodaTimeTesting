import org.joda.time.field.FieldUtils;



public class DriverYuliya{
	

	public static void main (String[] args) {

		FieldUtils.safeMultiply(1,2);
		FieldUtils.getWrappedValue(5, 1, 9);
		
		long l1 = 456;
		long l2 = 345;
		FieldUtils.safeMultiply(l1,l2);
		
	}
}
