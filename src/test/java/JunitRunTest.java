
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import suite.AutoServiceSuitTest;

public class JunitRunTest {
    public static void main(String... args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result run = jUnitCore.run(AutoServiceSuitTest.class);
    }
}

