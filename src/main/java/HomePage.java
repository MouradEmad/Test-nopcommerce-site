import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    By registerButton= By.className("ico-register");
    By loginButton=By.className("ico-login");
    WebElement registerButtonElement;
    public RegisterPage clickOnRegisterButton()
    {

        registerButtonElement =driver.findElement(registerButton);
        Clicking(registerButtonElement);
        return new RegisterPage(driver);
    }

    WebElement loginButtonElement;
    public LoginPage clickOnLoginButton()
    {

        loginButtonElement =driver.findElement(loginButton);
        Clicking(loginButtonElement);
        return new LoginPage(driver);
    }
}
