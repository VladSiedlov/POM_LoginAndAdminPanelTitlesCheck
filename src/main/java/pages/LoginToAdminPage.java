package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class LoginToAdminPage {

    @FindBy(name = "username")
    WebElement userNameControl;

    @FindBy(name = "password")
    WebElement userPasswordControl;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitButton;

    public LoginToAdminPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void loginAsAdmin(String username, String password) {
        userNameControl.sendKeys(username);
        userPasswordControl.sendKeys(password);
        submitButton.click();
    }

}
