/**
 * 
 */
package org.joda.time.chrono;

/**
 * 
 * @author Pavel Sozonov
 */
public class AccessorIslamicChronology {

	private static IslamicChronology ic = IslamicChronology.getInstanceUTC();

	public static long getYearDifference(long minuendInstant, long subtrahendInstant) {
		return ic.getYearDifference(minuendInstant, subtrahendInstant);
	}
}
