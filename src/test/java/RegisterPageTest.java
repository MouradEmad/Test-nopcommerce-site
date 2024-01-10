import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    private HomePage homePage ;
    private  RegisterPage registerPage;

    @Test
    public void ValidRegisterTC()
    {
        homePage = new HomePage(driver);
        registerPage = homePage.clickOnRegisterButton();
        registerPage.chooseGender();
        registerPage.EnterFirstName("Mourad");
        registerPage.EnterLastName("Emad");
        registerPage.EnterEmail("mourad@gmail.com");
        registerPage.EnterPassword("123456");
        registerPage.EnterRePassword("123456");
        registerPage.clickOnRegisterButton();

    }

}
