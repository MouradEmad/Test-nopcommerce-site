import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void ValidLoginTC()
    {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.enterEmail("mourad@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickingOnLoginButton();
    }
}
