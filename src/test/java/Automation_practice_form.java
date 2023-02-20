import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class Automation_practice_form {

   String filePath ="C:\\Users\\79085\\OneDrive\\Рабочий стол\\Скрины\\ljv.png";
   String fName = "Прудникова";
   String lName = "Екатерина";
   String email = "rvsn0913@mail.ru";
   String phoneNumber ="89281960486";
   String subjects = "AQA";
   String currentAddress = "Ростов-на-Дону";


    @Test
     public void registrationFormTest (){

        Configuration.browserSize="1024x1124";
        open ("https://demoqa.com/automation-practice-form");
        $ ("#firstName").setValue(fName);
        $ ("#lastName").setValue(lName);
        $ ("#userEmail").setValue(email);
//    $x ("//label[text()='Male']").click();
        $ ("#gender-radio-1").sendKeys(" ");
        $x ("//input[@id='userNumber']").setValue(phoneNumber);
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']//child::option[2]").click();
        $x("//select[@class='react-datepicker__year-select']//child::option[90]").click();
        $x("//div[@aria-label='Choose Wednesday, February 15th, 1989']").click();
        $x("//input[@aria-autocomplete='list']").sendKeys(subjects);
        $x("//label[text()='Reading']").click();
        $x("//input[@id='uploadPicture']").sendKeys(filePath);
        $x("//textarea[@placeholder='Current Address']").setValue(currentAddress);
        $x("//div[text()='Select State']").click();
        $x("//div[text()='NCR']").click();
        $x("//div[text()='Select City']").click();
        $x("//div[text()='Delhi']").click();
        $x("//button[@id='submit']").click();

        $x("//div[text()='Thanks for submitting the form']")
                .shouldHave(Condition.text("Thanks for submitting the form"));

        $x("//tbody").shouldHave(Condition.text(fName),
                Condition.text(lName), Condition.text(email), Condition.text("Male"),
                Condition.text("15 February,1989"), Condition.text("Reading"),
                Condition.text("ljv.png"), Condition.text(currentAddress),
                Condition.text("NCR Delhi"));

        $x("//tbody").shouldHave(Condition.text(phoneNumber),
                Condition.text(subjects)); // в номере телефона не добавилась 1 цифра, subjects не отображается;



    };
}
