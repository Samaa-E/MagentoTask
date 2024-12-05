package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By hotSellerSection = By.xpath("//h2[text()='Hot Sellers']");


    public HomePage (WebDriver driver){
        this.driver= driver;
    }

    public HotSellerPage ScrollToHotSeller(){
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", hotSellerSection);
        return new HotSellerPage(driver);
    }
}
