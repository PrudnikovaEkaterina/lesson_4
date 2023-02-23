import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelenideLesson1Test {
    String expectedResult = "@ExtendWith({SoftAssertsExtension.class})\n" +
            "class Tests {\n" +
            "  @Test\n" +
            "  void test() {\n" +
            "    Configuration.assertionMode = SOFT;\n" +
            "    open(\"page.html\");\n" +
            "\n" +
            "    $(\"#first\").should(visible).click();\n" +
            "    $(\"#second\").should(visible).click();\n" +
            "  }\n" +
            "}";

    @Test
    public void softAssertionsShouldHaveExampleJUnit5() {
        Configuration.browserSize = "1024x1124";
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(Condition.text("Soft assertions"));
        $x("//a[text()='Soft assertions']").click();
        String actualResult = $x("//div[@class='highlight highlight-source-java notranslate position-relative overflow-auto'][4]//child::pre").getText();
        assertEquals(expectedResult, actualResult);

    }
}
