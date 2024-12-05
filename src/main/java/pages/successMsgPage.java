package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class successMsgPage {

    private WebDriver driver;
    private By successMsgAlert = By.xpath("//div [@class='message-success success message']");
    private By saleLink = By.xpath("//a[@class='level-top ui-corner-all ui-state-focus']");

    public successMsgPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlert(){
       return driver.findElement(successMsgAlert).getText();
    }

    public SalePage clickSaleLink(){
        driver.findElement(saleLink).click();
        return new SalePage(driver);
    }
}
