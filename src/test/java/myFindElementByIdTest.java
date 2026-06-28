import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;



public class myFindElementByIdTest {
    @Test
    void test_findElement() {
        open("https://slqa.ru/tools/exam/student.php");
        $("#studentName").setValue("Симонова Алена");
    }
}
