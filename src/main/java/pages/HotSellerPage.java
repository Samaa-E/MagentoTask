package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotSellerPage {

    private WebDriver driver;
    private By firstProduct = By.xpath("(//a[contains(@title, 'Add to Compare')])[1]");
    private By secondProduct = By.xpath("(//a[contains(@title, 'Add to Compare')])[2]");

    public HotSellerPage (WebDriver driver){
        this.driver= driver;
    }

    public ComparePage clickAddToCompare(){
        driver.findElement(firstProduct).click();
        driver.findElement(secondProduct).click();
        return new ComparePage(driver);
    }
}
