package Tests;

import Pages.PecodeLoginPage;
import TestInitBasePage.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginBtnTest extends TestInit {

    @Test
    public void loginBtnTest(){

        PecodeLoginPage pecodeLoginPage = new PecodeLoginPage(driver);

        openUrl("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
        pecodeLoginPage.loginBtn().click();
        Assert.assertTrue(pecodeLoginPage.errorTextUnderField("Please enter username").getText().equals("Please enter username."));
        printLn("Message under username field is correct");
        Assert.assertTrue(pecodeLoginPage.errorTextUnderField("Please enter your password").getText().equals("Please enter your password."));
        printLn("Message under password field is correct");
    }
}
