package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalePage {

    private WebDriver driver;
    private By homeLink = By.xpath("//a[@title='Go to Home Page']");


    public SalePage (WebDriver driver){
        this.driver= driver;
    }

    public HomePage clickHomeLink(){
        driver.findElement(homeLink).click();
        return new HomePage(driver);
    }

}
