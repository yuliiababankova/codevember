package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptScrollTests extends BaseTests {

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
