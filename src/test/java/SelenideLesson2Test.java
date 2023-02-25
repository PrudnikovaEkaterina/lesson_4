import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideLesson2Test {
    SelenideElement a = $x("//div[@id='column-a']");
    SelenideElement b = $x("//div[@id='column-b']");

    @Test
    public void checkDownloadPage() {
        Configuration.browserSize = "1900x1124";
        open("https://github.com/");
        $x("//button[contains(text(),'Solutions')] ").hover();
        $x("//a[@href='/enterprise']").click();
        $x("//main").shouldHave(Condition.text("Build like the best"));
    }

    @Test
    public void dragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        a.dragAndDropTo(b).click();
        a.shouldHave(Condition.text("B"));
    }

    @Test
    public void actionDragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold(a).moveToElement(b).release().perform();
        a.shouldHave(Condition.text("B"));
    }
}
