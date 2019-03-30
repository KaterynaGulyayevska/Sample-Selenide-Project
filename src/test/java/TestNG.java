import Pages.LoginPageMaguru;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestNG {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {

        return new Object[][]{
                {"testmaguru9", "123123"}
        };
    }

    // Test data
//    String login = "testmaguru9";
//    String password = "123123";

    @BeforeTest
    public void beforeTest() {
        System.out.println("Here should be precondition and/or settings of driver connection");
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
    }

    @Test (dataProvider ="data-provider")

    public void testLogin(String name, String pass) {
        LoginPageMaguru loginPageMaguru = new LoginPageMaguru();
        open("http://go.dev.maguru.dk/#/login");
        Configuration.timeout = 8000;
        loginPageMaguru.enterLogin(name)
                        .enterPassword(pass)
                        .clickLogin();

    }


    /* public void testLogout() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickLogout();

    } // - нужно добавить анатацию или сделать в Main */


}
