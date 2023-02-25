import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class SelenideRepositorySearch {

    @Test
    void checkForACodeSample() {
        open("https://github.com/");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        $(linkText("selenide/selenide")).click();
        $("#wiki-tab").click();
        $(withText("more pages")).click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
