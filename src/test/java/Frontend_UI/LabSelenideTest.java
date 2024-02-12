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
        //chrome_options.add_argument('--remote-debugging-pipe')
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-debugging-pipe");
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        open("https://www.pravda.com.ua/eng/");
        assertEquals($x("//a[contains(text(),'Support Us')]").getAttribute("href"),  "https://www.pravda.com.ua/eng/supportus/");
    }
}