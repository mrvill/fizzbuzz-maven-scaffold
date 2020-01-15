import org.junit.Assert;
import org.junit.Test;

/**
 * @author created by wangwei
 * @date 2020年1月15日---下午7:39:47
 * @action
 */
public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(fizzBuzz.fiz(1), "1");
        Assert.assertEquals(fizzBuzz.fiz(3), "Fizz");
        Assert.assertEquals(fizzBuzz.fiz(5), "Buzz");
        Assert.assertEquals(fizzBuzz.fiz(15), "FizzBuzz");
    }

}
