package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class LoginPageMaguru {

    public void enterLogin (String login){
        $(By.cssSelector("#email")).sendKeys(login);
    }

    public void enterPassword (String password){
        $(By.cssSelector("#password")).sendKeys(password);
    }

    public void clickLogin(){
        $(By.cssSelector("#login-dialog-submit-btn > font > font")).click();
    }


}
