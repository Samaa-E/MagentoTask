package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("password-confirmation");
    private By createButton = By.xpath("//button[@title='Create an Account']");

    public CreateAccountPage (WebDriver driver){
        this.driver= driver;
    }

    public void setFirstNameField (){
        driver.findElement(firstNameField).sendKeys("Test1");
    }

    public void setLastNameField (){
        driver.findElement(lastNameField).sendKeys("User");
    }

    public void setEmailField () {
        String email = "test1user" + System.currentTimeMillis() + "@example.com";
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField() {
        driver.findElement(passwordField).sendKeys("Test@12345*");
    }

    public void setConfirmPasswordField() {
        driver.findElement(confirmPasswordField).sendKeys("Test@12345*");
    }

    public successMsgPage clickCreateButton(){
        driver.findElement(createButton).click();
        return new successMsgPage(driver);
    }

}
