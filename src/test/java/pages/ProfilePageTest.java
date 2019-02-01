package pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import org.joda.time.Seconds;
import org.junit.jupiter.api.Test;
import steps.HomePageSteps;
import steps.ProfilePageSteps;
import pages.ProfilePage;

public class ProfilePageTest {

    private final String url = ("https://github.com/");

    private ProfilePage profilePage = new ProfilePage();
    private HomePageSteps homePageSteps = new HomePageSteps();
    private ProfilePageSteps profilePageSteps = new ProfilePageSteps();


    String login = ("artem4eu@gmail.com");
    String password = ("QweZxcAsd123");

    @BeforeEach
    public void openandLogin() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin(); }

    @Test
    public void SetEmojiTest() {
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        String statusCheck = profilePage.noStatus.text();
        profilePageSteps.noStatuscheck();
        System.out.println("Your status is" + statusCheck);
        profilePageSteps.clickEmojibtn();
        profilePageSteps.seeDialog1();
        profilePageSteps.setEmojinew();
        profilePageSteps.submitEmoji();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        String statusAfter = profilePage.statusAfter.text();
        profilePageSteps.statusAFterCheck();
        System.out.println("Your new status is "+statusAfter);
    }

    @Test
    public void ResetEmojiTest() {
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        String statusAfter = profilePage.statusAfter.text();
        profilePageSteps.statusAFterCheck();
        System.out.println("Your status is "+statusAfter);
        profilePageSteps.clickOnActiveStatus();
        profilePageSteps.resetStatusDialoge();
        profilePageSteps.clickResetStatusbtn();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        String statusCheck = profilePage.noStatus.text();
        profilePageSteps.noStatuscheck();
        System.out.println("Your status is" + statusCheck);
    }
}

