package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.ProfilePage;

public class ProfilePageSteps {
    private ProfilePage profilePage = new ProfilePage();

    @Step
    public void clickDropdownbtn() {profilePage.profileDropdown.click();}

    @Step
    public void clickReposbtn() {profilePage.reposbtn.click();}

    @Step
    public void noStatuscheck() {profilePage.noStatus.shouldHave(Condition.text("Set your status"));}

    @Step
    public void clickEmojibtn() {profilePage.setEmojibtn.click();}

    @Step
    public void seeDialog1() {profilePage.editStatusDialog.shouldBe(Condition.visible);}

    @Step
    public void setEmojinew() {profilePage.focusingbtn.shouldBe(Condition.visible).click();}

   // @Step
   // public void seeDialog2() {profilePage.submitDialog.shouldHave(Condition.visible);}

    @Step
    public void submitEmoji() {profilePage.setStatusbtn.click();}

    @Step
    public void statusAFterCheck() {profilePage.statusAfter.shouldHave(Condition.text("Focusing"));}

    @Step
    public void clickOnActiveStatus() {profilePage.activeStatusbtn.click();}

    @Step
    public void resetStatusDialoge() {profilePage.resetStatusDialog.shouldBe(Condition.visible);}

    @Step
    public void clickResetStatusbtn() {profilePage.resetStatusbtn.click();}


  /*  @Step
    public void resetEmoji() {profilePage.resetStatusbtn.click();}*/
}