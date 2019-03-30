package Listeners;

import Pages.LoginPageMaguru;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    String name = "testmaguru9";
    String pass = "123123";
    String invalid_pass = "111";

    public void testLogin() {
        LoginPageMaguru loginPageMaguru = new LoginPageMaguru();
        open("http://go.dev.maguru.dk/#/login");
        System.out.println("LoginTest.testLogin");
        loginPageMaguru.enterLogin(name)
                        .enterPassword(pass)
                        .clickLogin();


    }

    public void testLoginInvalid () {
        LoginPageMaguru loginPageMaguru = new LoginPageMaguru();
        open("http://go.dev.maguru.dk/#/login");
        System.out.println("LoginTest.testLoginInvalid");
        loginPageMaguru.enterLogin(name)
                .enterPassword(invalid_pass)
                .clickLogin();

    }

}
