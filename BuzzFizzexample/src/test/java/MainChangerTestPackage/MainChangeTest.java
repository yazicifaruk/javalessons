package MainChangerTestPackage;
import BuzzFizzChange.ChangeWork;
import org.junit.Test;

public class MainChangeTest{
    ChangeWork cw = new ChangeWork();
    @Test
    public void mainChange() {
        for (int i = 1; i < 100; i++) {
            System.out.println(cw.change(i));

        }

    }
}