import org.junit.Test;

import static org.junit.Assert.fail;

public class HelloworldTest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}