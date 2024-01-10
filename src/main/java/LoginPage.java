import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By email = By.id("Email");
    private WebElement emailElement;
    private By password = By.id("Password");
    private WebElement passwordElement;
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private WebElement loginButtonElement;

    public void enterEmail(String Email)
    {
        emailElement = driver.findElement(email);
        sendText(emailElement,Email);
    }

    public void enterPassword(String Pass)
    {
        passwordElement =driver.findElement(password);
        sendText(passwordElement,Pass);
    }

    public void clickingOnLoginButton()
    {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);
    }

}
