import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHeroku {

    private WebDriver driver;
    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }


    private String url = "https://the-internet.herokuapp.com/login";
    private By login = By.id("username");
    private By senha = By.id("password");
    private By botaoLogin = By.className("radius");

    @Test
    public void login(){
        driver.get(url);
    }

}
