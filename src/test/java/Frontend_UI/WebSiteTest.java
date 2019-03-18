package Frontend_UI;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebSiteTest {

    private static final Logger log = LoggerFactory.getLogger(WebSiteTest.class);

   @Test
    public void userCanLoginByUsername() {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchmel\\programs\\WebDriverChrome73\\chromedriver.exe");

       open("https://www.newsmanagers.com/fr/inscription-newsletter");
       $("button.agree-button").click();
       $("input#edit-submit").click();

       try {
           Thread.sleep(100000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       log.info( getWebDriver().getCurrentUrl() );
       log.trace("Trace Message!");
       log.debug("Debug Message!");
       log.info("Info Message!");
       log.warn("Warn Message!");
       log.error("Error Message!");
       //log.fatal("Fatal Message!");


        $(By.name("q")).setValue("Тарифи").pressEnter();

        $("div.b_search_results > ul > li:nth-child(1) > h3 > a").shouldHave(text("Тарифи"));
   }
}
