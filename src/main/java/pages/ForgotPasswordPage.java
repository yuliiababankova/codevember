package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailAddress = By.cssSelector("#email");
    private By retrievePassword = By.cssSelector("#form_submit");


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }

    public SecureAreaPage clickRetrievePassword(){
        driver.findElement(retrievePassword).click();
        return  new SecureAreaPage(driver);
    }
}
