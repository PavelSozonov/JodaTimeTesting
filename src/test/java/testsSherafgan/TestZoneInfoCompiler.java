package testsSherafgan;

import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 4/5/17
 */
public class TestZoneInfoCompiler {
    @Test
    public void testZoneInfoProviderConstructor() throws Exception {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        zoneInfoCompiler.main(new String[]{});
        assertNotEquals(null, zoneInfoCompiler);
    }
}
