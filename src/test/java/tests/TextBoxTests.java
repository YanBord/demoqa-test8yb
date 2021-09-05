package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

     @BeforeAll
     static void beforeAll() {
       Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Yan");
        $("#userEmail").setValue("shinodyan@gmail.com");
        $("#currentAddress").setValue("vavilova street");
        $("#permanentAddress").setValue("gagarina street");
        $("#submit").scrollTo().click();

        $("#output #name").shouldHave(text("Yan"));
        $("#output #email").shouldHave(text("shinodyan@gmail.com"));
        $("#output #currentAddress").shouldHave(text("vavilova street"));
        $("#output #permanentAddress").shouldHave(text("gagarina street"));

    }
}
