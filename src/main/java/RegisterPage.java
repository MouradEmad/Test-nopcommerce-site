import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By genderMale = By.id("gender-male");
    private WebElement genderMaleElement ;
    private By firstName = By.id("FirstName");
    private WebElement firstNameElement;
    private By lastName = By.id("LastName");
    private WebElement lastNameElement;
    private By emailField = By.id("Email");
    private WebElement emailFieldElement;
    private By passwordField = By.id("Password");
    private WebElement passwordFieldElement;
    private By rePasswordFeild = By.id("ConfirmPassword");
    private WebElement rePasswordFeildElement;
    private By registerButton = By.id("register-button");
    private WebElement registerButtonElement ;

    public void EnterFirstName(String fName)
    {
        firstNameElement=driver.findElement(firstName);
        sendText(firstNameElement,fName);
    }
    public void EnterLastName(String lName)
    {
        lastNameElement=driver.findElement(lastName);
        sendText(lastNameElement,lName);
    }
    public void EnterPassword(String password)
    {
        passwordFieldElement=driver.findElement(passwordField);
        sendText(passwordFieldElement,password);
    }
    public void EnterRePassword(String rePassword)
    {
        rePasswordFeildElement=driver.findElement(rePasswordFeild);
        sendText(rePasswordFeildElement,rePassword);
    }
    public void EnterEmail(String email)
    {
       emailFieldElement=driver.findElement(emailField);
        sendText(emailFieldElement,email);
    }

    public void chooseGender()
    {
        genderMaleElement = driver.findElement(genderMale);
        Clicking(genderMaleElement);
    }
    public void clickOnRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
    }




}
