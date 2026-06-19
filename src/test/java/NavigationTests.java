import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

    public class NavigationTests {
        @Test
        void testNavigation() {
            open("https://chat.deepseek.com/");
            sleep(3_000);
            open("https://grls.minzdrav.gov.ru/default.aspx");
            sleep(3_000);
            open("https://zakupki.gov.ru/epz/main/public/home.html");
            sleep(3_000);
            back();
            sleep(3_000);
            back();
            sleep(3_000);
            forward();
            sleep(10_000);
        }

    }
