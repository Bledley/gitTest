package pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.joda.time.Seconds;
import org.junit.jupiter.api.Test;
import steps.HomePageSteps;
import steps.ProfilePageSteps;


public class ProfilePageTest {

    private final String url = ("https://github.com/");

    private HomePageSteps homePageSteps = new HomePageSteps();
    private ProfilePageSteps profilePageSteps = new ProfilePageSteps();

    String login = ("bledley123@gmail.com");
    String password = ("ydyzapuhy635046");


    @Test
    public void SetEmojiTest() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReprisitoriesbtn();
        profilePageSteps.clickEmojibtn();
       // sleep(1000);
        profilePageSteps.seeDialog1();
        profilePageSteps.setEmojinew();
       // profilePageSteps.seeDialog2();
        profilePageSteps.submitEmoji();
    }
}