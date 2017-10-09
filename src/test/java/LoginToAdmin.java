import pages.LoginToAdminPage;
import utils.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LoginToAdmin {

    private final String appLink = "http://localhost/litecart/admin/login.php";
    private final String username = "admin";
    private final String password = "admin";

    @Before
    public void setup() {
        DriverFactory.getDriver().get(appLink);
    }

    @Test
    public void loginToAdminPanel() {
        new LoginToAdminPage().loginAsAdmin(username, password);
    }
    
    @After
    public void teardown() {
        DriverFactory.getDriver().quit();
    }
}