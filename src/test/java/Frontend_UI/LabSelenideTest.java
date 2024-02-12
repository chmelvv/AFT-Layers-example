package Frontend_UI;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LabSelenideTest {
    private static final Logger log = LoggerFactory.getLogger(LabSelenideTest.class);

    @Test
    public void LabSelenideTest() {
        open("https://www.toolsqa.com/automation-practice-form");
        log.debug( $(".vc_message_box").getText() );
        log.debug( $("div.wpb_wrapper h1").getText() );
        $(Selectors.byPartialLinkText("Partial")).click();
        $(By.name("firstname")).setValue("My First Name");
        $(By.name("lastname")).setValue("Last Name");
        $("#continents").selectOptionContainingText("Australia");
        $("#selenium_commands").selectOptionContainingText("Browser Commands");
        $("#selenium_commands").selectOptionContainingText("Wait Commands");
    }
}