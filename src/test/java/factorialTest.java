import org.junit.Assert;
import org.junit.Test;

public class factorialTest {

    @Test
    public void factorialTest() {
        int i = 5;
        Factorial fl = new Factorial();
        Long expected = 120L;
        Long actual = fl.factorial(i);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void factorialTest1() {
        int i = 3;
        Factorial fl = new Factorial();
        Long expected = 6L;
        Long actual = fl.factorial(i);
        Assert.assertEquals(expected,actual);
    }
}