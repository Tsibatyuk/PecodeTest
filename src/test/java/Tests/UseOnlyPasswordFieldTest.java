package Tests;

import Pages.PecodeLoginPage;
import TestInitBasePage.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseOnlyPasswordFieldTest extends TestInit {

    @Test
    public void messageOnlyPasswordFieldUsingTest(){

        PecodeLoginPage pecodeLoginPage = new PecodeLoginPage(driver);

        openUrl("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
        pecodeLoginPage.inputText("password").sendKeys("someText");
        pecodeLoginPage.loginBtn().click();
        Assert.assertTrue(pecodeLoginPage.errorTextUnderField("Please enter username").getText().equals("Please enter username."));
        printLn("Message is displayed correctly");
    }
}