import convertorpack.Convertor;
import org.junit.Assert;
import org.junit.Test;

public class ExampleTest{
    @Test
    public void expectTryOne() {
        Convertor example = new Convertor();
        Assert.assertEquals("1", example.convert(1));
    }

    @Test
    public void exceptTryTwo() {
        Convertor example = new Convertor();
        Assert.assertEquals("2", example.convert(2));
    }

    @Test
    public void threeTry() {
        Convertor example = new Convertor();
        Assert.assertEquals("1,2,Fizz", example.convert(3));
    }

    @Test
    public void fiveTry() {
        Convertor example = new Convertor();
        Assert.assertEquals("1,2,Fizz,4,Buzz", example.convert(5));
    }

    @Test
    public void fifteenTry() {
        Convertor example = new Convertor();
        Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz", example.convert(15));
    }

}


