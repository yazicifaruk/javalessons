package BuzzFizzexample;
import BuzzFizzChange.ChangeWork;
import org.junit.Assert;
import org.junit.Test;


public class BuzzFizzTest{
    @Test
    public void startExpect(){
        ChangeWork cw= new ChangeWork();
        Assert.assertEquals("1",cw.change(1));
        Assert.assertEquals("2",cw.change(2));
    }
    @Test
    public void three(){
        ChangeWork cw= new ChangeWork();
        Assert.assertEquals("3",cw.change(3));
    }
    @Test
    public void five(){
        ChangeWork cw= new ChangeWork();
        Assert.assertEquals("5",cw.change(5));
    }
    @Test
    public void fifteen(){
        ChangeWork cw= new ChangeWork();
        Assert.assertEquals("15",cw.change(15));
    }


}
