package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {

    // This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This method will send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

// ***********************************Alert methods***********************************************
    }

    //This method will switch to Alert
    public void switchToAlert(By by) {
        driver.findElement(by).click();
        driver.switchTo().alert();
    }

    //This method will accept the alert
    public void accept(By by) {
        driver.findElement(by).click();
        driver.switchTo().alert().accept();
    }

    //This method will dismiss the alert
    public void dismissTheAlert(By by) {
        driver.findElement(by).click();
        driver.switchTo().alert().dismiss();
    }

    //This method will alert and then get text
    public String getText(By by, String text) {
         driver.findElement(by).getText();
         return driver.switchTo().alert().getText();
    }

    //This method will send keys
    public void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
        driver.switchTo().alert().sendKeys("text");

    }
    public void sendTextToElement(By by) {
        driver.findElement(by).clear();
    }

    //*************************************Select class method******************************
    // This method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);

    }
    //store value
    public List<WebElement> listOfWebElementsList(By by){
        return  driver.findElements(by);
    }
    //mouse hover
    public void mousehover(By by){
        Actions actions = new Actions(driver);
        WebElement menu=driver.findElement(by);
        actions.moveToElement(menu).build().perform();


    }
}
