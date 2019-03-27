package maguru.dev.dk;

import Pages.ContactsPage;
import Pages.LoginPageMaguru;
import Pages.DashboardPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.util.zip.DataFormatException;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MaguruTest {

  @Test

  public void SearchContact () {

        Configuration.remote="http://localhost:4444/wd/hub";
        Configuration.browser="chrome";

       LoginPageMaguru loginPageMaguru = new LoginPageMaguru();
       DashboardPage dashboardPage = new DashboardPage();
       ContactsPage contactsPage = new ContactsPage();

        open("http://go.dev.maguru.dk/#/login");

        // Step 1
      loginPageMaguru.enterLogin("testmaguru9@gmail.com")
              .enterPassword("123123")
              .clickLogin();

      // Step 2
      dashboardPage.openContactPage();

      // Step 3
      contactsPage.selectAccount();

      // Step 4
      contactsPage.searchContact();






    }


}
