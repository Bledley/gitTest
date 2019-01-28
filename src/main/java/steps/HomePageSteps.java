package steps;

import io.qameta.allure.Step;
import pages.HomePage;

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
    public void clicknewReprisitorybtn() {homepage.newReprisitorybtn.click();}

    @Step
    public void enterReprisitoryname(String newReprisitoryname) {homepage.reprisitoryNamefield.setValue(newReprisitoryname);}

    @Step
    public void enterReprisitorydesc (String reprisitorydesc) {homepage.preprisitoryDescriptionfield.setValue(reprisitorydesc);}

    @Step
    public void clicksubmitReprisitorybtn() {homepage.submitReprisitory.click();}
}