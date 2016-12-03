
import org.junit.runner.JUnitCore;
import suite.AutoServiceSuitTest;

public class JunitRunTest {
    public static void main(String... args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.run(AutoServiceSuitTest.class);
    }
}

