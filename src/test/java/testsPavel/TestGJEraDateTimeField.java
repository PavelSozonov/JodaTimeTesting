package testsPavel;

import static org.junit.Assert.assertEquals;

import org.joda.time.chrono.AccessorGJEraDateTimeField;
import org.junit.Test;

/**
 * This class is a Junit unit test for GJEraDateTimeField.
 * 
 * @author Pavel Sozonov
 */
public class TestGJEraDateTimeField {

	@Test
	public void testSet() {
		AccessorGJEraDateTimeField accessor = new AccessorGJEraDateTimeField();
		long result = accessor.set(500, 1);
		assertEquals(500, result);
	}

}
