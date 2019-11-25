package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void ForgotPasswordTest() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForfotPassword();
        forgotPasswordPage.setEmailAddress("test@test.com");
        SecureAreaPage secureAreaPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(secureAreaPage.getEmailText().contains("Your e-mail's been sent!"),
                "Email is incorrect");
    }
}
