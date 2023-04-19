package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {
    @Given("The user is on the login page")
    public void the_user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc_roberto\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chebanca.it/");
    }


    @When("ciao ciao")
    public void ciao_ciao(){
        System.out.println("ciao ciao");
    }
}