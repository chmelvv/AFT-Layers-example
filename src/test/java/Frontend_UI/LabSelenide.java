package Frontend_UI;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LabSelenide {
    private static final Logger log = LoggerFactory.getLogger(LabSelenium.class);


    @Test
    public void LabSelenideTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchmel\\programs\\WebDriverChrome73\\chromedriver.exe");

        //TODO Открыть тестовую страницу: https://www.toolsqa.com/automation-practice-form
        open("https://www.toolsqa.com/automation-practice-form");

        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println( $(".vc_message_box").getText() );

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println( $("div.wpb_wrapper h1").getText() );

        //TODO: Кликнуть линк Partial Link Test
        $(Selectors.byPartialLinkText("Partial")).click();
        // $(Selectors.byText("Partial Link Test")).click(); // Full text needed to assert

        //TODO: Заполнить поле First name:
        $(By.name("firstname")).setValue("My First Name");

        //TODO: Заполнить поле Last name:
//        WebElement lastName = driver.findElement(By.name("lastname"));
//        lastName.sendKeys("Last Name");

        $(By.name("lastname")).setValue("Last Name");

        //TODO: Выбрать пол

        //TODO: Выбрать количество лет опыта

        //TODO: Заполнить поле дата

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка
//        WebElement continentSelector = driver.findElement(By.id("continents"));
//        Actions builder = new Actions(driver);
//        builder.click(continentSelector).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();


                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//        Select anotherContinentSelector = new Select(driver.findElement(By.id("continents")));
//        anotherContinentSelector.selectByVisibleText("Australia");
//
//        //TODO: Выбрать несколько вариантов из списка Selenium Commands
//        Select commandsSelector = new Select(driver.findElement(By.id("selenium_commands")));
//        commandsSelector.selectByVisibleText("Browser Commands");
//        commandsSelector.selectByVisibleText("Navigation Commands");

        // System.out.println(Arrays.toString(commandsSelector.getAllSelectedOptions().toArray() ) );

        //TODO: Кликнуть на кнопку Button

        //TODO: Вывести в консоль текст лейбла Text1

        //TODO: Вывести в консоль текст лейбла Text2

        //TODO: Закрыть браузер

    }

}
