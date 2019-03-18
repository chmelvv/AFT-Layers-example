package Frontend_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LabSelenium{
    private static final Logger log = LoggerFactory.getLogger(LabSelenium.class);

    @Test
    public void LabSeleniumTest() {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchmel\\programs\\WebDriverChrome73\\chromedriver.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения
        WebElement messageBox = driver.findElement(By.className("vc_message_box"));
        System.out.println("messageBox text = " + messageBox.getText());

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println("Form header text = " + driver.findElement(By.cssSelector("div.wpb_wrapper h1")).getText());
        //TODO: Кликнуть линк Partial Link Test
        WebElement partialLink = driver.findElement(By.partialLinkText("Partial"));
        partialLink.click();

        //TODO: Заполнить поле First name:
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("My First Name");

        //TODO: Заполнить поле Last name:
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Last Name");

        //TODO: Выбрать пол

        //TODO: Выбрать количество лет опыта

        //TODO: Заполнить поле дата

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка
        WebElement continentSelector = driver.findElement(By.id("continents"));
        Actions builder = new Actions(driver);
        builder.click(continentSelector).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

        //        try {
        //            Thread.sleep(500);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }

        Select anotherContinentSelector = new Select(driver.findElement(By.id("continents")));
        anotherContinentSelector.selectByVisibleText("Australia");

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        Select commandsSelector = new Select(driver.findElement(By.id("selenium_commands")));
        commandsSelector.selectByVisibleText("Browser Commands");
        commandsSelector.selectByVisibleText("Navigation Commands");

        // System.out.println(Arrays.toString(commandsSelector.getAllSelectedOptions().toArray() ) );

        //TODO: Кликнуть на кнопку Button

        //TODO: Вывести в консоль текст лейбла Text1

        //TODO: Вывести в консоль текст лейбла Text2

        //TODO: Закрыть браузер
        driver.quit();
    }
}
