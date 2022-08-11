package Tests;

import Pages.PecodeLoginPage;
import TestInitBasePage.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseOnlyUsernameFieldTest extends TestInit {

    @Test
    public void messageOnlyUsernameFieldUsingTest(){

        PecodeLoginPage pecodeLoginPage = new PecodeLoginPage(driver);

        openUrl("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
        pecodeLoginPage.inputText("username").sendKeys("Username");
        pecodeLoginPage.loginBtn().click();
        Assert.assertTrue(pecodeLoginPage.errorTextUnderField("Please enter your password").getText().equals("Please enter your password."));
        printLn("Message is displayed correctly");
    }
}
