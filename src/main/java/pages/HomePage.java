package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By formAddRemoveElements = By.cssSelector("#content > ul > li:nth-child(2) > a");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormElements(){
        driver.findElement(formAddRemoveElements).click();
        return new LoginPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }


}
