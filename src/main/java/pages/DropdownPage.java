package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage  {
    private WebDriver driver;
    public WebDriverWait wait;
    private By dropdown = By.id("dropdown");


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFormDropDown(String option){
        findDropDownElenent().selectByVisibleText(option);
    }

    public List<String> getSelectOptions(){
        List<WebElement> selectElements =
                findDropDownElenent().getAllSelectedOptions();
        return selectElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElenent(){
        return new Select(driver.findElement(dropdown));
    }
    public void makePause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement clickWhenReady(WebElement element) {
        makePause(200);
        waitForVisible(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return element;
    }

    public WebElement waitForVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.border='3px dashed #ffe207'", element);
        return element;
    }



}
