import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    long seed = 1;

    Faker faker=new Faker(new Locale("ru"), new Random(seed)); //подключаем библиотеку для генерации тестовых данных. Если не передаватғ в качестве аргумента new Random(seed),
    // то данные будут каждый раз разные; Если предавать, то генерится одно и тоже. /new Locale("ru") - язык генерации данных

    String firstName = faker.name().firstName(); // генерируется тестовое имя

    String lastName = faker.name().lastName();

    String phone = faker.phoneNumber().subscriberNumber(11); //генерируется тестовый номер из 11 цифр

    Date birthday = faker.date().birthday(); // формат Thu May 12 15:33:43 MSK 1977 /

    LocalDate birthday1=faker.date().birthday().toInstant()
            .atZone(ZoneId.systemDefault()).toLocalDate(); // формат 2001-03-05

    // Эта строка кода выполняет преобразование объекта типа java.util.Date (или его подкласса, такого как java.sql.Date или java.sql.Timestamp)
    // в объект типа java.time.LocalDate, используя классы java.time.Instant, java.time.ZoneId и java.time.LocalDate из нового API дат Java.
    //
    //Более подробно, эта строка кода выполняет следующие действия:
    //
    //Вызов метода toInstant() объекта Date преобразует его в объект типа Instant, который представляет момент времени на временной шкале UTC (координированное всемирное время).
    //
    //Вызов метода atZone(ZoneId.systemDefault()) создает объект типа ZonedDateTime, который представляет тот же момент времени, но с учетом часового пояса,
    // соответствующего текущей системной настройке.
    //
    //Вызов метода toLocalDate() преобразует объект ZonedDateTime в объект типа LocalDate, который представляет дату без учета времени и часового пояса.
    //
    //Таким образом, данная строка кода выполняет преобразование объекта Date в объект LocalDate, который удобно использовать для работы с датами без учета времени и часовых поясов.


    String month = StringUtils.capitalize(birthday1.getMonth().name().toLowerCase()); //получаю имя месяца (все большими буквами),
    // затем toLowerCase() все буквы делает маленькими, а StringUtils.capitalize делает первую букву слова заглавной.

    String day = String.valueOf(birthday1.getDayOfMonth());

    String day1=birthday1.format(DateTimeFormatter.ofPattern("dd")); //Дата LocalDate = LocalDate.now(); Строковый текст = date.format(formatter);
    // ofPattern(String pattern) Создает средство форматирования с использованием указанного шаблона.

    String year = Integer.toString(birthday1.getYear());

    String[] genders = new String[]{"Male","Female","Other"};

    String gender = getRndValueArr(genders);

    public static String getRndValueArr(String[] arr) {
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    } //метод для выбора рандомного значения из масссива

   @Test
   public void print (){
       System.out.println(firstName);
       System.out.println(lastName);
       System.out.println(phone);
       System.out.println(birthday);
       System.out.println(birthday1);
       System.out.println(month);
       System.out.println(day);
       System.out.println(day1);
       System.out.println(year);
   }


   String fName = "Прудникова";
   String lName = "Екатерина";
   String email = "rvsn0913@mail.ru";
   String phoneNumber ="9281960486";
   String currentAddress = "Ростов-на-Дону";
   File file=new File("src/test/resources/ljv.png");


    @Test
     public void registrationFormTest (){
//
//        Configuration.browserSize="1024x1124";
//        open ("https://demoqa.com/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");  //убираем баннеры java скриптом
        executeJavaScript("$('footer').remove()");

//        $ ("#firstName").setValue(fName);
//        $ ("#lastName").setValue(lName);
//        $ ("#userEmail").setValue(email);
//        $x ("//label[text()='Male']").click();
//        $x ("//input[@id='userNumber']").setValue(phoneNumber);
//        $x("//input[@id='dateOfBirthInput']").click();
//        $x("//select[@class='react-datepicker__month-select']//child::option[2]").click();
//        $x("//select[@class='react-datepicker__year-select']//child::option[90]").click();
//        $x("//div[@aria-label='Choose Wednesday, February 15th, 1989']").click();
//        $x("//input[@aria-autocomplete='list']").setValue("e");
//        $x("//div[text()='English']").click();
//        $x("//label[text()='Reading']").click();
//        $x("//input[@id='uploadPicture']").uploadFile(file);
//        $x("//textarea[@placeholder='Current Address']").setValue(currentAddress);
//        $x("//div[text()='Select State']").click();
//        $x("//div[text()='NCR']").click();
//        $x("//div[text()='Select City']").click();
//        $x("//div[text()='Delhi']").click();
//        $x("//button[@id='submit']").click();
//
//        $x("//div[text()='Thanks for submitting the form']")
//                .shouldHave(Condition.text("Thanks for submitting the form"));
//
//        $x("//tbody").shouldHave(Condition.text(fName));
//        $x("//tbody").shouldHave(Condition.text(lName));
//        $x("//tbody").shouldHave(Condition.text(email));
//        $x("//tbody").shouldHave(Condition.text("Male"));
//        $x("//tbody").shouldHave(Condition.text("15 February,1989"));
//        $x("//tbody").shouldHave(Condition.text("Reading"));
//        $x("//tbody").shouldHave(Condition.text("ljv.png"));
//        $x("//tbody").shouldHave(Condition.text(currentAddress));
//        $x("//tbody").shouldHave(Condition.text("NCR Delhi"));
//        $x("//tbody").shouldHave(Condition.text(phoneNumber));
//        $x("//tbody").shouldHave(Condition.text("English"));
//




    };
}
