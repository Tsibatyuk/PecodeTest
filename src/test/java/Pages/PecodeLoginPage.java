package Pages;

import TestInitBasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PecodeLoginPage extends BasePage {

    public PecodeLoginPage(WebDriver driver) {
        super(driver);
    }
    // for Username field use- "username"
    // for Password field use- "password"
    private static final String INPUT_TEXT_FIELD = "//input[contains(@name,'%s')]";
    private static final String LOGIN_BTN = "//input[contains(@class,'btn-success')]";
    //input for wrong username- "No account found with that username"
    //input for empty username field- "Please enter username"
    //input for empty password field- "Please enter your password"
    private static final String TEXT_UNDER_TEXT_FIELD = "//span[contains(text(),'%s')]";
    private static final String TEXT_UNDER_LOGO = "//h1[contains(text(),'AQA internship Login')]";

    public WebElement inputText(String option) {
        return $(String.format(INPUT_TEXT_FIELD, option));
    }

    public WebElement loginBtn() {
        return $(LOGIN_BTN);
    }

    public WebElement errorTextUnderField(String option) {
        return $(String.format(TEXT_UNDER_TEXT_FIELD, option));
    }

    public WebElement textUnderLogo(){
        return $(TEXT_UNDER_LOGO);
    }

    public void countLengthMethod(){
        for (int i = 0; i < 20; i++) {
            inputText("username").sendKeys("qqq");
        }
    }
}
