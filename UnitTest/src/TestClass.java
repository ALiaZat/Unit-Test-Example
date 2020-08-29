import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void IsLeapYearTest(){

        Calender ca = new Calender();

        ca.setYear(2000);
        ca.isLeapYear();

        Assert.assertEquals(true,ca.isLeapYear());
        Assert.assertEquals(2000,ca.getYear());

    }
}
