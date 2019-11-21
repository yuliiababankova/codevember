package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
         editorPage.clearTextArea();

         String text1 = "hello ";
         String text2= "world";

         editorPage.setTextArea(text1);
         editorPage.setDecreaseIndention();
         editorPage.setTextArea(text2);

         assertEquals(editorPage.getTextFormEditor(), text1+text2, "Text from editor is incorrect");
    }


}
