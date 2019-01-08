import com.fizzbuzzexample.FizzBuzzConvertor;
import org.junit.Test;

public class FizzBuzzApp{
    @Test
    public void outPutScreen(){
        FizzBuzzConvertor fizzbuzz=new FizzBuzzConvertor();
        for(int i=1;i<100;i++)
            System.out.println(fizzbuzz.convertor(i));
    }

}
