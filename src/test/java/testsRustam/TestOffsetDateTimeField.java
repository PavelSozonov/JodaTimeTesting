package testsRustam;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;


public class TestOffsetDateTimeField extends TestCase {
  public static void main(String[] args) {
  junit.textui.TestRunner.run(suite());
}

public static TestSuite suite() {
  return new TestSuite(org.joda.time.field.TestOffsetDateTimeField.class);
}

public void test_constructor1() {
  OffsetDateTimeField field = new OffsetDateTimeField(
          ISOChronology.getInstance().secondOfMinute(), 999999);
  assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
  assertEquals(field.getMinimumValue() + 999999, field.getMinimumValue());

  try {
      field = new OffsetDateTimeField(null, 3);
      fail();
  } catch (IllegalArgumentException ex) {}

  try {
      field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0);
      fail();
  } catch (IllegalArgumentException ex) {}
  try {
      field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(
              DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0);
      fail();
  } catch (IllegalArgumentException ex) {}
}}
