import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestJava {

   // @BeforeTest
   // public void beforeTest() {
      // Configuration.remote = "http://localhost:4444/wd/hub";
     //  Configuration.browser = "chrome";
     // open("http://go.dev.maguru.dk/#/login"); }


    @Test
    @Parameters("browser")
    public void parameterTest(String browser) {
        if (browser.equals("chrome")) {
            System.out.println("Open Chrome Driver");
        }  else if (browser.equals("firefox")){
            System.out.println("Open Chrome Driver");
        }
    }

}
