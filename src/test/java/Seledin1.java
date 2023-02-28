import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Seledin1 {
    @Test
    public void div (){
        Configuration.browserSize="1024x1124";
        open ("https://github.com/selenide/selenide");
        $ ("#wiki-tab").click();
        $ (".markdown-body").shouldHave(text("Soft assertions"));
        $x ("//a[text()='Soft assertions']").click();

        $("#user-content-3-using-junit5-extend-test-class)#user-content-3-using-junit5-extend-test-class").shouldHave(href(""));
        sleep(5000);



    }
}
