package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AddRemoveElementsTest  extends BaseTests {
    private By addElements = By.cssSelector("#content > div > button");

    @Test
    public void addRemoveElemenrs(){
        LoginPage loginPage = homePage.clickFormElements();



    }


}
