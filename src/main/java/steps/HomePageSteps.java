package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import pages.HomePage;
import com.codeborne.selenide.ElementsCollection;

public class HomePageSteps {
    private HomePage homepage = new HomePage();

    @Step
    public void clickSigninbtn() {homepage.signinbtn.click();}

    @Step
    public void enterLogin(String login) {homepage.loginField.setValue(login);}

    @Step
    public void enterPass(String password) {homepage.passwordField.setValue(password);}

    @Step
    public void submitLogin() {homepage.submitLoginbtn.click();}

    @Step
    public void repoListSize() {homepage.repoList.size();}

    @Step
    public void repoListSizeResult(int sizeAfter) {homepage.repoList.shouldHaveSize(sizeAfter);}

    @Step
    public void clicknewRepobtn() {homepage.newRepobtn.click();}

    @Step
    public void enterReponame(String newReponame) {homepage.repoNamefield.setValue(newReponame);}

    @Step
    public void enterRepodesc (String reprisitorydesc) {homepage.repoDescriptionfield.setValue(reprisitorydesc);}

    @Step
    public void clicksubmitRepobtn() {homepage.submitRepo.click();}

    @Step
    public void cliconCreatedRepo() {homepage.createdRepo.toWebElement().click();}

    @Step
    public void clickonSettingsbtn() {homepage.settingsbtn.shouldBe(Condition.visible).toWebElement().click();}

    @Step
    public void deleteRepo() {homepage.deleteRepobtn.shouldBe(Condition.visible).toWebElement().click();}

    @Step
    public void deleteRepoDialog() {homepage.deleteRepoDialog.shouldBe(Condition.visible);}

    @Step
    public void setRepoNameToDelete(String newReponame) {homepage.setRepoName.setValue(newReponame);}

    @Step
    public void clickonsubmitRepodelete() {homepage.submitRepodelete.click();}

    @Step
    public void createdRepoNotvis() {homepage.createdRepo.shouldNotBe(Condition.visible);}
}