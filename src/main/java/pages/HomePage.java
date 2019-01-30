package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ElementsCollection;

public class HomePage {

    public SelenideElement signinbtn = $(xpath("//a[@class='HeaderMenu-link no-underline mr-3']"));
    public SelenideElement loginField = $(xpath("//input[@class='form-control input-block']"));
    public SelenideElement passwordField = $(xpath("//input[@class='form-control form-control input-block']"));
    public SelenideElement submitLoginbtn = $(xpath("//input[@class='btn btn-primary btn-block']"));
    //public ElementsCollection repoList = $$(xpath("//ul[@data-filterable-for='your-repos-filter']"));
    public ElementsCollection repoList = $$(xpath("//ul[@data-filterable-for='your-repos-filter']/li"));
    public SelenideElement newReprisitorybtn = $(xpath("//a[@class='btn btn-primary ml-3']"));
    public SelenideElement reprisitoryNamefield = $(xpath("//input[@class='form-control js-repo-name short']"));
    public SelenideElement preprisitoryDescriptionfield = $(xpath("//input[@class='form-control long']"));
    public SelenideElement submitReprisitory = $(xpath("//button[@class='btn btn-primary first-in-line']"));
    public SelenideElement createdReprisitory = $(xpath("//a[@itemprop='name codeRepository']"));
    public SelenideElement settingsbtn = $(xpath("(//a[@class='js-selected-navigation-item reponav-item'])[6]"));
    public SelenideElement deleteReprisitorybtn = $(xpath("(//summary[@class='btn btn-danger boxed-action'])[4]"));
    public SelenideElement deleteReprisitoryDialog = $ (xpath("//details-dialog[@class='Box Box--overlay d-flex flex-column anim-fade-in fast']"));
    public SelenideElement setReprisitoryName = $(xpath("(//input[@class='form-control input-block'])[3]"));
    public SelenideElement submitReprisitorydelete = $(xpath("(//button[@class='btn btn-block btn-danger'])[4]"));
}