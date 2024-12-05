package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        CreateAccountPage createAccountPage = initialPage.clickAccountLink();
        createAccountPage.setFirstNameField();
        createAccountPage.setLastNameField();
        createAccountPage.setEmailField();
        createAccountPage.setPasswordField();
        createAccountPage.setConfirmPasswordField();
        successMsgPage successMsgPage =  createAccountPage.clickCreateButton();
        assertTrue(successMsgPage.getAlert().contains("Thank you for registering with Main Website Store."), "Alert Text is correct");
        SalePage salePage = successMsgPage.clickSaleLink();
        HomePage homePage =salePage.clickHomeLink();
        HotSellerPage hotSellerPage = homePage.ScrollToHotSeller();
        ComparePage comparePage = hotSellerPage.clickAddToCompare();


    }
}
