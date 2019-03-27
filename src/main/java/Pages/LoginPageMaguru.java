package Pages;

import org.openqa.selenium.By;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

// добавить приватный драйвер
// find element - приватные классы
// методы - публичные


public class LoginPageMaguru {


    public LoginPageMaguru enterLogin (String name){
        $(By.cssSelector("#email")).sendKeys(name);
        return this;
    }

    public LoginPageMaguru enterPassword (String pass){
        $(By.cssSelector("#password")).sendKeys(pass);
        return this;
    }

    public void clickLogin(){
        $(By.xpath("//*[@type='submit']")).click();
    }



}
