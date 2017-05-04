import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {

    @Test
    public void listenerRunsOnFailedTest() {
        Assert.assertEquals(false, true);
    }

    @Test
    public void listenerDoesNotRunOnPassedTest() {
        Assert.assertEquals(true, true);
    }
}