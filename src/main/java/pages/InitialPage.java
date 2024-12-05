package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InitialPage {

    private WebDriver driver;

    private By createAnAccountLink = By.linkText("Create an Account");

    public InitialPage(WebDriver driver){

        this.driver= driver;
    }
    public CreateAccountPage clickAccountLink(){
        driver.findElement(createAnAccountLink).click();
        return new CreateAccountPage(driver);
    }
}
