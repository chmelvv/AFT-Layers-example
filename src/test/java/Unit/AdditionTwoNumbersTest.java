package Unit;

import com.mainacad.AdditionTwoNumbers;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTwoNumbersTest {

//    private static final Logger log = LoggerFactory.getLogger( AdditionTwoNumbersTest.class );

    @DataProvider(name = "AddingTestDP")
    public Object[][] createData1() {
        return new Object[][] {
                { 0, 0, 0 },
                { 2, 2, 4},
        };
    }

    private void add(int a,  int b, int expected) {
        AdditionTwoNumbers twoNumbers = new AdditionTwoNumbers( a, b);
        Assert.assertEquals(expected, twoNumbers.add());
    }

    @Test(dataProvider = "AddingTestDP")
    public void runAddTest( int a, int b, int expectedSum) {
//        log.trace("Trace Message!");
//        log.debug("Debug Message!" + getClass().getName().toString() );
//        log.info("Info Message!" + a + " " + b + " " + expectedSum);
//        log.warn("Warn Message!");
//        log.error("Error Message!");
        add(a, b, expectedSum);
    }
}