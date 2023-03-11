package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PageSberHealth;

import static io.qameta.allure.Allure.step;

public class MainPageSberHealth extends TestBase { ;
  @DisplayName("Страница логина содержит кнопку Госуслуги")
  @Owner("ElenaQAE")
  @Test
  void userAccountDetails() {;
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы логина", () -> {
      pageSberHealth.openPageLogin();
    });
    step("Проверка, что есть кнопка Госуслуги", () -> {
      pageSberHealth.verifyGosuslugiButton();
    });
  }

  @DisplayName("Страница приём врача в клинике содержит информацию о записи на приём онлайн")
  @Owner("ElenaQAE")
  @Test
  void doctorVisit() {
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы приём врача в клинике", () -> {
      pageSberHealth.doctorVisitPage();
    });
    step("Проверка, что страница содержит информацию о записи на прием онлайн", () -> {
      pageSberHealth.verifyOnlineAppointment();
    });
  }

  @DisplayName("Страница онлайн-консультации содержит информацию о срочных консультациях")
  @Owner("ElenaQAE")
  @Test
  void onlineСonsultations() {
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы онлайн-консультации", () -> {
      pageSberHealth.onlineСonsultationsPage();
    });
    step("Проверка, что страница содержит информацию о срочных консультациях", () -> {
      pageSberHealth.verifyEmergencyConsultations();
    });
  }

  @DisplayName("Страница диагностика содержит информацию о подборе исследования")
  @Owner("ElenaQAE")
  @Test
  void diagnostic() {
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы диагностика", () -> {
      pageSberHealth.diasgnosticPage();
    });
    step("Проверка, что страница содержит информацию о подборе исследования", () -> {
      pageSberHealth.verifyStudySelection();
    });
  }

  @DisplayName("Cтраница услуги содержит кнопку Найти")
  @Owner("ElenaQAE")
  @Test
  void services() {
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы услуги", () -> {
      pageSberHealth.servicesPage();
    });
    step("Проверка, что страница содержит содержит кнопку Найти", () -> {
      pageSberHealth.verifySearchButton();
    });

  }

  @DisplayName("На странице компаниям, заголовок 'любой случай' отображен белым цветом")
  @Owner("ElenaQAE")
  @Test
  void goMainPageByLogo() {
    step("Открытие страницы СбеЗдоровье", () -> {
      pageSberHealth.openPageSberHealth();
    });
    step("Открытие страницы компаниям", () -> {
      pageSberHealth.CompaniesPage();
    });
    step("Проверка, что заголовок 'любой случай' отображен белым цветом", () -> {
      pageSberHealth.verifyAnyCaseWhiteColor();
    });

  }
}