import static org.junit.Assert.*;
import org.junit.*;

/**
 * Commands to run in terminal:
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoTest.java
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoTest
 */

public class SkillDemoTest {
    @Test
    public void test1(){
        assertEquals("happy 49th birthday", SkillDemo.birthday(50));
    }
}
