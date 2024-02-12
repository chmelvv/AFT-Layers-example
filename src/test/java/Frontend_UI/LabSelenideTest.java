package Frontend_UI;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class LabSelenideTest {

    @Test
    public void LabSelenideTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-pipe");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        open("https://www.pravda.com.ua/eng/");
        assertEquals($x("//a[contains(text(),'Support Us')]").getAttribute("href"),  "https://www.pravda.com.ua/eng/supportus/");
    }
}