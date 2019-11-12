package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
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

}
