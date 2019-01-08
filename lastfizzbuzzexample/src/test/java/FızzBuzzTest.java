

import com.fizzbuzzexample.FizzBuzzConvertor;
import org.junit.Assert;
import org.junit.Test;

public class FızzBuzzTest{

    @Test
    public void fizzBuzzConvertormethods(){
        FizzBuzzConvertor fizzbuzz=new FizzBuzzConvertor();
        Assert.assertEquals("1",fizzbuzz.convertor(1));
        Assert.assertEquals("2",fizzbuzz.convertor(2));
    }
    @Test
    public void convertofthree(){
        FizzBuzzConvertor fizzbuzz=new FizzBuzzConvertor();
        Assert.assertEquals("3",fizzbuzz.convertor(3));
    }
    @Test
    public void convertoffive(){
        FizzBuzzConvertor fizzbuzz=new FizzBuzzConvertor();
        Assert.assertEquals("5",fizzbuzz.convertor(5));}
        @Test
        public void convertoffifteen(){
            FizzBuzzConvertor fizzbuzz=new FizzBuzzConvertor();
            Assert.assertEquals("15",fizzbuzz.convertor(15));
}}
