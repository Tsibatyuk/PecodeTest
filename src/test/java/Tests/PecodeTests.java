package Tests;

import Pages.PecodeLoginPage;
import TestInitBasePage.TestInit;
import org.testng.annotations.Test;

public class PecodeTests extends TestInit {

    @Test
    public void usernameFieldLengthTest() {
        PecodeLoginPage pecodeLoginPage = new PecodeLoginPage(driver);

        openUrl("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
        pecodeLoginPage.countLengthMethod();
        pecodeLoginPage.inputText("username").sendKeys("\n");
        System.out.println("number of input symbols is " + pecodeLoginPage.inputText("username").getAttribute("value").length());
        pecodeLoginPage.inputText("password").sendKeys("password");
        pecodeLoginPage.loginBtn().click();
        pecodeLoginPage.assertTestOne();
    }
}