import org.junit.*;
import static org.junit.Assert.*;


public class SkillRunTester {
    @Test
    public void stringGreaterTest() {
        assertTrue("true", SkillRun.stringGreater("bat", "house"));
    }
}
