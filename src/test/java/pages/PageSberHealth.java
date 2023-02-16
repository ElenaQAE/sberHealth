package pages;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageSberHealth {
  private final String TEXT = "Медицинские сервисы";
  private final String TEXT2 = "Госуслуги";
  private final String TEXT3 = "Запишитесь на приём к врачу онлайн";
  private final String TEXT4 = "Срочные консультации";
  private final String TEXT5 = "Подобрать исследование";
  private final String TEXT6 = "Найти";
  private final String COLOR = "rgba(255, 255, 255, 1)";

  public PageSberHealth openPageSberHealth() {
    open("https://sberhealth.ru/");
    $(".med-service__title").shouldHave(text(TEXT));
    return this;
  }

  public PageSberHealth openPageLogin() {
    $(".the-button--type-grey").click();
    return this;
  }

  public PageSberHealth verifyGosuslugiButton() {
    $("[data-testid='esia-link']").shouldHave(text(TEXT2));
    return this;
  }

  public PageSberHealth doctorVisitPage() {
    $(".the-header__links").$(byText("Приём врача в клинике")).click();
    return this;
  }

  public PageSberHealth verifyOnlineAppointment() {
    $(".SearchFormLayout__title_2ugp").shouldHave(text(TEXT3));
    return this;
  }

  public PageSberHealth onlineСonsultationsPage() {
    $(".the-header__links").$(byText("Онлайн-консультации")).click();
    return this;
  }

  public PageSberHealth verifyEmergencyConsultations() {
    $("[data-testid=urgent-consultations-block-container]").shouldHave(text(TEXT4));
    return this;
  }

  public PageSberHealth diasgnosticPage() {
    $(".the-header__links").$(byText("Диагностика")).click();
    return this;
  }

  public PageSberHealth verifyStudySelection() {
    $(".organ-top-list__title").shouldHave(text(TEXT5));
    return this;
  }

  public PageSberHealth servicesPage() {
    $(".the-header__links").$(byText("Услуги")).click();
    return this;
  }

  public PageSberHealth verifySearchButton() {
    $("[data-test-id=search_button]").shouldHave(text(TEXT6));
    return this;
  }

  public PageSberHealth CompaniesPage() {
    $(".the-header__links").$(byText("Компаниям")).click();
    return this;
  }
//ПОМЕНЯТЬ НАЗВАНИЕ ВВЕРХУ ИИ ССНИУЗ
  public PageSberHealth verifyAnyCaseWhiteColor() {
    $("[field=tn_text_1651675406623]").shouldHave(cssValue("color",
            COLOR));
    return this;
  }

}
