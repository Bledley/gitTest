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
    public void clicknewReprisitorybtn() {homepage.newReprisitorybtn.click();}

    @Step
    public void enterReprisitoryname(String newReprisitoryname) {homepage.reprisitoryNamefield.setValue(newReprisitoryname);}

    @Step
    public void enterReprisitorydesc (String reprisitorydesc) {homepage.preprisitoryDescriptionfield.setValue(reprisitorydesc);}

    @Step
    public void clicksubmitReprisitorybtn() {homepage.submitReprisitory.click();}

    @Step
    public void cliconCreatedReprisitory() {homepage.createdReprisitory.toWebElement().click();}

    @Step
    public void clickonSettingsbtn() {homepage.settingsbtn.shouldBe(Condition.visible).toWebElement().click();}

    @Step
    public void deleteReprisitory() {homepage.deleteReprisitorybtn.shouldBe(Condition.visible).toWebElement().click();}

    @Step
    public void deleteReprisidoryDialog() {homepage.deleteReprisitoryDialog.shouldBe(Condition.visible);}

    @Step
    public void setReprisitoryNameToDelete(String newReprisitoryname) {homepage.setReprisitoryName.setValue(newReprisitoryname);}

    @Step
    public void clickonsubmitReprisitorydelete() {homepage.submitReprisitorydelete.click();}

    @Step
    public void createdReprisitoryNotvis() {homepage.createdReprisitory.shouldNotBe(Condition.visible);}
}