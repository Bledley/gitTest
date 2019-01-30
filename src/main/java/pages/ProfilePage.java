package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import static com.codeborne.selenide.Selectors.byText;


public class ProfilePage {
    public SelenideElement profileDropdown = $(xpath("//span[@class='dropdown-caret']"));
    public SelenideElement reposbtn = $(xpath("(//a[@href='/BledleyTest?tab=repositories'])[1]"));
    public SelenideElement noStatus = $(xpath("(//span[@class='link-gray'])[2]"));
    public SelenideElement setEmojibtn = $(xpath("//div[@class='user-status-emoji-container flex-shrink-0 ']"));
    public SelenideElement editStatusDialog = $(xpath("(//form[@class='position-relative flex-auto js-user-status-form'])[2]"));
    public SelenideElement focusingbtn = $(xpath("(//button[@class='d-flex flex-items-baseline flex-items-stretch lh-condensed f6 btn-link link-gray no-underline js-predefined-user-status mb-1'])[8]"));
   //public SelenideElement setEmoji = $(xpath("//div[@class='d-flex flex-items-center no-underline js-predefined-user-status-message']"));
    //public SelenideElement submitDialog = $(xpath("(((//form[@class='position-relative flex-auto js-user-status-form'])[2]"));
    public SelenideElement setStatusbtn = $(xpath("(//button[@class='width-full btn btn-primary mr-2 js-user-status-submit'])[2]"));
    public SelenideElement activeStatus = $(xpath("//div[@class=' user-status-message-wrapper f6 lh-condensed ws-normal pt-3']"));
    public SelenideElement resetStatusDialog = $ (xpath("(//form[@class='position-relative flex-auto js-user-status-form'])[2]"));
    public SelenideElement resetStatusbtn = $(xpath("(//button[@class='width-full js-clear-user-status-button btn ml-2 js-user-status-exists'])[2]"));
}

