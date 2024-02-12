package Frontend_UI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class LabSelenideTest {

    @Test
    public void LabSelenideTest() {
        open("https://www.pravda.com.ua/eng/");
        assertEquals($x("//a[contains(text(),'Support Us')]").getAttribute("href"),  "https://www.pravda.com.ua/eng/supportus/");
    }
}