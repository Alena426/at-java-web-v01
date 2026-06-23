import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class mySimpleAutoTest {
    @Test
    void test01() {
        open("http://92.51.36.108:7777/sl.qa");
        $("body").shouldHave(text("Учебные приложения"));
    }
    @Test
    void test02() {
        open("http://92.51.36.108:7777/sl.qa");
        $("body").shouldHave(text("Промышленные приложения"));
    }
    @Test
    void test03(){
        open("https://grls.minzdrav.gov.ru/Default.aspx");
        $("body").shouldHave(text("Безопасность лекарственных препаратов"));
        }
    @Test
    void test04(){
        open("https://grls.minzdrav.gov.ru/Default.aspx");
        $("body").shouldHave(text("jbknkk"));
    }
}
