import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class LinguaLeo {


    @BeforeTest
    public void beforTest() {
        Configuration.browser = "opera";
     //   Configuration.browserCapabilities = new DesiredCapabilities();
    }

    @Test
    public static void test () {
        ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--disable-notifications");
        options.addExtensions(new File("/Users/kateg/Documents/QA_Auto_7/"+
                "Sample-Selenide-Project/LinguaLeo-English-Translator_v2.0.3.4.crx"));
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        //sleep(8000);
        open("https://www.google.com.ua/search?client=opera&q=google&sourceid=opera&ie=UTF-8&oe=UTF-8");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //$(By.cssSele

        $(By.xpath("//*[@id='btnClosePage'']")).click();


        open("https://en.wikipedia.org/wiki/Main_Page");
        $(By.xpath("//*[contains(test(),'Originally')]")).doubleClick();

        open("https://www.google.com.ua/search?client=opera&q=google&sourceid=opera&ie=UTF-8&oe=UTF-8");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //$(By.cssSelector("#btnClosePage")).click();
        open("https://en.wikipedia.org/wiki/Main_Page");
        $(By.xpath("//*[@id='btnClosePage'']")).click();
        $(By.xpath("//*[contains(test(),'Originally')]")).doubleClick();

        int a = 0;
    }
}
