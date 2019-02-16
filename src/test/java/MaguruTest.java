import Pages.LoginPageMaguru;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MaguruTest {

  @Test
    // почему аннотация здесь не разрешена

  public void SearchContact{

        Configuration.remote="http://localhost:4444/wd/hub";
        Configuration.browser="chrome";

       // LoginPageMaguru loginPageMaguru = new LoginPageMaguru();

        open("http://go.dev.maguru.dk/#/login");
        new LoginPageMaguru().enterLogin("testmaguru9@gmail.com");
        // зачем new?
        // почему не могу писать в столбик каждый метод через точку?




    }


}
