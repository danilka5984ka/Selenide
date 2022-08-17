import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.DateChange;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryOrderTest extends DateChange {

    @Test
    void testValidValues() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").val("Москва");
        $("[data-test-id='date'] input").sendKeys(Keys.CONTROL + "A");
        $("[data-test-id='date'] input").sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] input").val(dateChangeDay());
        $("[data-test-id='name'] input").val("Иванов-Петров Иван");
        $("[data-test-id='phone'] input").val("+79879879879");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $("[type='button'] .button__text").click();
    }

    @Test
    void findItemDropdownList() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").val("Но");
        $$("[class='popup__container'] span").findBy(text("Новосибирск")).click();
        $("[data-test-id='date'] input").sendKeys(Keys.CONTROL + "A");
        $("[data-test-id='date'] input").sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] input").val(dateChangeDay());
        $("[data-test-id='name'] input").val("Иванов-Петров Иван");
        $("[data-test-id='phone'] input").val("+79879879879");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $("[type='button'] .button__text").click();
    }

    @Test
    void selectDateWeekAhead() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").val("Но");
        $$("[class='popup__container'] span").findBy(text("Новосибирск")).click();
        $("[data-test-id='date'] input").sendKeys(Keys.CONTROL + "A");
        $("[data-test-id='date'] input").sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] input").val(dateChangeWeek());
        $("[data-test-id='name'] input").val("Иванов-Петров Иван");
        $("[data-test-id='phone'] input").val("+79879879879");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $("[type='button'] .button__text").click();
    }
}
