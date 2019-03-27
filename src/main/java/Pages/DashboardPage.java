package Pages;


import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class DashboardPage {

    public DashboardPage openContactPage(){
       // $(By.xpath("//*[contains(@class,'navbar-collapse.collapse')]//following-sibling::*['Contacts']")).click();

        $(By.xpath("//*[contains(@class,'navbar-collapse.collapse')]//following-sibling::*['root.contact.list']")).click();
        // можно ли использоваться во второй части contains?
        // как можно еще искать?

        return this;
    }

    // public void getContactsItemXPath ()

    // String format

    public DashboardPage clickLogout(){
        $(By.xpath("//a[contains(text(),'logout()')]")).click();
        return this;
    }



}
