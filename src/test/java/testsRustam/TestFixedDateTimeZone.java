package testsRustam;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.Test;

public class TestFixedDateTimeZone extends TestCase {
    public static TestSuite suite() {
        return new TestSuite(TestFixedDateTimeZone.class);
    }
    @Test
    public void test1() {
        FixedDateTimeZone zone = new FixedDateTimeZone("+12345", "B", 1, 5);
        assertEquals(
                "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]",
                zone.toTimeZone().toString());
    }

}
