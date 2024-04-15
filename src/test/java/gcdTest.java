import org.junit.Assert;
import org.junit.Test;

public class gcdTest {
    @Test
    public void gcdTest(){
        int n1 = 40;
        int n2 = 5;
        GCD gs = new GCD();
        int expected = 5;
        int actual = gs.gcd(n1, n2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest1(){
        int n1 = 47;
        int n2 = 56;
        GCD gs = new GCD();
        int expected = 1;
        int actual = gs.gcd(n1, n2);
        Assert.assertEquals(expected, actual);
    }
}
