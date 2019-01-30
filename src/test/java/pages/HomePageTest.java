package pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;
import org.junit.Before;
import steps.ProfilePageSteps;
import pages.HomePage;


public class HomePageTest {

public String url = ("https://github.com/");

private HomePageSteps homePageSteps = new HomePageSteps();
private ProfilePageSteps profilePageSteps = new ProfilePageSteps();
private HomePage homePage = new HomePage();


String login = ("artem4eu@gmail.com");
String password = ("QweZxcAsd123");
String newReprisitoryname = ("testReprisitory1");
String reprisitorydesc = ("testDesc");



@Test
    public void loginTest() {
    open(url);
    homePageSteps.clickSigninbtn();
    homePageSteps.enterLogin(login);
    homePageSteps.enterPass(password);
    homePageSteps.submitLogin(); }

    @Test
    public void createnewReprisitory() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReprisitoriesbtn();
        int listSize = homePage.repoList.size();
        homePageSteps.repoListSize();
        System.out.println("Page has" +listSize +"repositories");
        //homePageSteps.repoListSize(listSize);
        homePageSteps.clicknewReprisitorybtn();
        homePageSteps.enterReprisitoryname(newReprisitoryname);
        homePageSteps.enterReprisitorydesc(reprisitorydesc);
        homePageSteps.clicksubmitReprisitorybtn();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReprisitoriesbtn();
        int sizeAfter = listSize +1;
        homePageSteps.repoListSizeResult(sizeAfter);
        System.out.println("Page has " + sizeAfter + "repositories"); }

    @Test
    public void deletecreatedReprisitory() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReprisitoriesbtn();
        int listSize = homePage.repoList.size();
        homePageSteps.repoListSize();
        System.out.println("Page has" +listSize +"repositories");
        homePageSteps.cliconCreatedReprisitory();
        homePageSteps.clickonSettingsbtn();
        homePageSteps.deleteReprisitory();
        homePageSteps.deleteReprisidoryDialog();
        homePageSteps.setReprisitoryNameToDelete(newReprisitoryname);
        homePageSteps.clickonsubmitReprisitorydelete();
        //Check if reprisitory is deleted
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReprisitoriesbtn();
        int sizeAfter = listSize -1;
        homePageSteps.repoListSizeResult(sizeAfter);
        System.out.println("Page has " + sizeAfter + "repositories");}
}