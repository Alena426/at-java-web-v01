import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class myTestUsername {
    @Test
    void Testusername(){
        open("https://slqa.ru/cases/ChatGPTLogin/");
        $("#username").sendKeys("standard_user");
        }
        @Test
    void Testname(){
        open("http://92.51.36.108:7777/sl.qa/fc/v01/ ");
        $("[name=sum]").sendKeys("300");
        }
        @Test
    void Testclass(){
        open("https://ru.wikipedia.org/wiki/Selenium");
        $(".mw-page-title-main").shouldHave(text("Selenium"));
        }
}
