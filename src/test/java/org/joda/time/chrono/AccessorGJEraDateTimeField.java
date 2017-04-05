/**
 * 
 */
package org.joda.time.chrono;

import org.joda.time.DateTimeZone;

/**
 * 
 * @author Pavel Sozonov
 */
public class AccessorGJEraDateTimeField {

	private GJEraDateTimeField field = new GJEraDateTimeField(IslamicChronology.getInstance(DateTimeZone.UTC));

	private GJEraDateTimeField getField() {
		return field;
	}

	public long set(long instant, int era) {
		return getField().set(instant, era);
	}
}
