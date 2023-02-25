import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.*;

public class Novo {
    String url = "https://agency.novo-estate.ru/";
    String phoneNumber = "79085040794";
    String smsCode = "909090";

    @Test
    public void registration() {
        Configuration.browserSize = "1900x950";
        open(url);
        var cookie = new Cookie("developer_mode", "LadcZWB8a15L");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        $x("//span[text()='Войти']").click();
        $("[type='tel']").setValue(phoneNumber);
        $(".el-checkbox__inner").click();
        $x("//span[text()='Отправить код для входа ']").click();
        $("[type='text']").setValue(smsCode);
        $x("//span[text()='Продолжить ']").click();
        $x("//i[@class='el-icon one-column-header__account-icon']").hover();
        $x("//span[@class='user-menu__dropdown-text']").shouldHave(Condition.text("Профиль"));
    }

    @Test
    public void scrollMainPage() {
        Configuration.browserSize = "1900x950";
        open(url);
        SelenideElement element= $x("//div[@class='search-item search-novostroyki-items__item'][last()]");
        SelenideElement footer = $x("//div[@class='one-column-footer__menu']");
        boolean b=true;
        while (b){
            actions().moveToElement(element).perform();
            if (footer.is(Condition.visible))
                b=false;
            sleep(5000);}

//        SelenideElement element2 = $x("//div[@class='search-item search-novostroyki-items__item'] [30]");
//        SelenideElement element1 = $x("//div[@class='search-item search-novostroyki-items__item'] [15]");
        actions().moveToElement(element).perform();
//        element1.scrollIntoView(false);
//        sleep(7000);
//        element2.scrollIntoView(true);



//        actions().dragAndDropBy(element, 1000, 0).perform();
//      //div[@class='infinity-scroll__body']

//                executeJavaScript ( "window.scrollBy(0,document.body.scrollHeight)" );
////
//        $x("//div[@class='infinity-scroll__viewport']").scrollIntoView(false);

    }
}
