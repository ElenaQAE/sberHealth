# Проект по автоматизации тестирования главной страницы sberhealth.ru


## :woman_health_worker:: Содержание:

- [Стек технологий](#earth_africa-Стек-технологий)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-c-Allure-TestOps)
- [Интеграция с Jira](#earth_africa-Интеграция-c-Jira)
- [Уведомления в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :closed_book:: Стек технологий

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## :stethoscope:: Реализованные проверки

Автаматизированные тесты
- ✓ Страница логина содержит кнопку Госуслуги
- ✓ Страница приём врача в клинике содержит информацию о записи на приём онлайн
- ✓ Страница онлайн-консультации содержит информацию о срочных консультациях
- ✓ Страница диагностика содержит информацию о подборе исследования
- ✓ Cтраница услуги содержит кнопку Найти
- ✓ На странице компаниям, заголовок 'любой случай' отображен белым цветом

## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка <a target="_blank" href="https://jenkins.autotests.cloud/job/elena_sber//"> Jenkins </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/elena_sber/"><img src="images/jenkins1.png" alt="jenkins1"/></a>
</p>

## :test_tube:: Параметры сборки в Jenkins:
- remote (адрес удаленного сервера)
- browser_size (размер окна браузера, по умолчанию 1920x1080)
- browser_version (версия браузера, по умолчанию 100.0)
- browser (браузер, по умолчанию chrome)

## :syringe:: Запуск тестов
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dremote=${REMOTE}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-Dbrowser=${BROWSER}
```

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure отчет <a target="_blank" href="https://jenkins.autotests.cloud/job/IBS_test/allure/"></a>

## :chart_with_upwards_trend:: Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="images/allure.png">
</p>

## :pill:: Пример тест кейса
<p align="center">
<img title="AllureSuite" src="images/allure_suite.png">
</p>

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure_TO"/></a> Интеграция с Allure TestOps <a target="_blank" href="https://allure.autotests.cloud/project/1858/dashboards"></a>

## :framed_picture:: Доска
<p align="center">
<img title="AllureDashboard" src="images/dashboard.png">
</p>

## :rocket:: Запуски
<p align="center">
<img title="Allure Tests" src="images/launches.png">
</p>

## <img src="images/logo/Jira.svg" width="25" height="25"  alt="Jira"/></a> Интеграция с Jira <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-519"></a>

<p align="center">
<img title="Jira" src="images/jira.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/></a> Уведомления в телеграм с использованием бота

<p align="center">
<img title="telegram" src="images/telegram.png">
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25" alt="Jenkins"/></a> Selenoid. Пример прогона тестов. <a target="_blank" href="https://selenoid.autotests.cloud/gif/example.gif"> </a>

<p align="center">
<img title="Selenoid Video" src="images/sberhealth.gif" width="250" height="153"  alt="video"> 
</p>


