
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SearchTest {

    // additional information look at https://selenide.org/quick-start.html
    // additional information look at https://selenide.org/documentation.html
    // usefull video https://www.youtube.com/watch?v=5c3z_iddWX0


    @Test
    public void userCanSearchAnyKeyword() {

        Configuration.remote="http://localhost:4444/wd/hub";
        Configuration.browser="chrome";

        open("http://google.com");
        $(By.name("q")).val("selenide");
        $(By.name("q")).pressEnter();
        $$("#ires .g").shouldHave(size(10));
        $("#ires .g").shouldHave(text("selenide.org"));
    }
}
