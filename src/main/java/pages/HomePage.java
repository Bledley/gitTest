package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public SelenideElement signinbtn = $(xpath("//a[@class='HeaderMenu-link no-underline mr-3']"));
    public SelenideElement loginField = $(xpath("//input[@class='form-control input-block']"));
    public SelenideElement passwordField = $(xpath("//input[@class='form-control form-control input-block']"));
    public SelenideElement submitLoginbtn = $(xpath("//input[@class='btn btn-primary btn-block']"));
}