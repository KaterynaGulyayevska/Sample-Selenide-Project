package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {

    public ContactsPage selectAccount () {

        $(By.xpath("//*[@class='col-md-3']//following::*[contains(text(),'Template 3')]"));

        // Можно ли в xPath задать переменную?

        return this;

    }

    public ContactsPage searchContact () {

        String s = "kat";

        // Как вывести переменную из Page Object

        $(By.xpath("//*[@type='text']")).setValue(s).pressEnter();

        // Как действия вывести в тестовый файл, а тут оставить просто поиск элементов?

        return this;
    }
}
