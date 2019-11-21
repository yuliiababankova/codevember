package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading().clickExample1();
        ((DynamicLoadingExample1Page) loadingPage).clickStarrt();
        assertEquals(((DynamicLoadingExample1Page) loadingPage).getLoadedText(),"Hello World!", "Loaded text incorrect");
    }
}
