package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.PageSberHealth;

public class TestBase {
  PageSberHealth pageSberHealth = new PageSberHealth();
  @BeforeAll
  static void beforeAll() {
    WebDriverProvider provider = new WebDriverProvider();
  }

  @BeforeEach
  void beforeEach() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
  }

  @AfterEach
  void addAttachments() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}