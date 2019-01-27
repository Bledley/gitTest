package pages;

import static com.codeborne.selenide.Selenide.open;
import org.junit.jupiter.api.Test;
import steps.HomePageSteps;

public class HomePageTest {

private final String url = ("https://github.com/");

private HomePageSteps homePageSteps = new HomePageSteps();

String login = ("bledley123@gmail.com");
String password = ("ydyzapuhy635046");

@Test
    public void loginTest(){
    open(url);
    homePageSteps.clickSigninbtn();
    homePageSteps.enterLogin(login);
    homePageSteps.enterPass(password);
    homePageSteps.submitLogin();
}
}