import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

import static com.codeborne.selenide.Selenide.*;

public class CalculatorTest {
    @Test
            void Testcalculator(){
        open("https://fincalculator.ru/kalkulyator-dnej");
        $(".date-value").setValue("29.03.2026");
        $("#totalDays.all-column12").setValue("150");
        sleep(2000);





    }


}
