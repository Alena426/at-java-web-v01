import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


import static com.codeborne.selenide.Selenide.open;

class homework1 {
    @Test
        void testSuccessfulLogin() {
            open("https://www.saucedemo.com/");
            // Вводим валидные данные
            $("#user-name").sendKeys("standard_user");
            $("#password").sendKeys("secret_sauce");
            $("#login-button").click();

            // Проверяем, что появился заголовок "Products"
            $(".title").shouldHave(text("Products"));

        }
    @Test
    public void test02LoginWrongPassword() {
        open("https://www.saucedemo.com/");
        $("#user-name").sendKeys("standard_user");
        $("#password").sendKeys("ролдл");
        $("#login-button").click();

        // Проверяем, что появился заголовок "ошибка"
        $(".error").shouldHave(text("Epic sadface: Username and password do not match any user in this service"));

        //*SelenideElement myElement = $("input[name+username]");
       // $(By.id("username")).setValue("standard_user");
       // $(By.id("password")).setValue("asdfasdfasdfasdfasdf");
       // $(By.id("loginButton")).click();*//
     //   $(By.className("error-button")).shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
    }

}
