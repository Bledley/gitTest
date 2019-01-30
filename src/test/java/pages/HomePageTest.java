package pages;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;
import steps.HomePageSteps;
import steps.ProfilePageSteps;


public class HomePageTest {

public String url = ("https://github.com/");

private HomePageSteps homePageSteps = new HomePageSteps();
private ProfilePageSteps profilePageSteps = new ProfilePageSteps();
private HomePage homePage = new HomePage();


String login = ("artem4eu@gmail.com");
String password = ("QweZxcAsd123");
String newReprisitoryname = ("testRepo1");
String reprisitorydesc = ("testDesc");



@Test
    public void loginTest() {
    open(url);
    homePageSteps.clickSigninbtn();
    homePageSteps.enterLogin(login);
    homePageSteps.enterPass(password);
    homePageSteps.submitLogin(); }

    @Test
    public void createnewRepository() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        int listSize = homePage.repoList.size();
        homePageSteps.repoListSize();
        System.out.println("Page has" +listSize +"repositories");
        //homePageSteps.repoListSize(listSize);
        homePageSteps.clicknewRepobtn();
        homePageSteps.enterReponame(newReprisitoryname);
        homePageSteps.enterRepodesc(reprisitorydesc);
        homePageSteps.clicksubmitRepobtn();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        int sizeAfter = listSize +1;
        homePageSteps.repoListSizeResult(sizeAfter);
        System.out.println("Page has " + sizeAfter + "repositories"); }

    @Test
    public void deletecreatedRepository() {
        open(url);
        homePageSteps.clickSigninbtn();
        homePageSteps.enterLogin(login);
        homePageSteps.enterPass(password);
        homePageSteps.submitLogin();
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        int listSize = homePage.repoList.size();
        homePageSteps.repoListSize();
        System.out.println("Page has" +listSize +"repositories");
        homePageSteps.cliconCreatedRepo();
        homePageSteps.clickonSettingsbtn();
        homePageSteps.deleteRepo();
        homePageSteps.deleteRepoDialog();
        homePageSteps.setRepoNameToDelete(newReprisitoryname);
        homePageSteps.clickonsubmitRepodelete();
        //Check if reprisitory is deleted
        profilePageSteps.clickDropdownbtn();
        profilePageSteps.clickReposbtn();
        int sizeAfter = listSize -1;
        homePageSteps.repoListSizeResult(sizeAfter);
        System.out.println("Page has " + sizeAfter + "repositories");}
}