# ТЕСТОВОЕ ЗАДАНИЕ ДЛЯ АТТЕСТАЦИИ

# Постановка задачи:
- Имеется некая система, которая обрабатывает авиа перелёты.
- Перелёт — это перевозка пассажира из одной точки в другую с возможными промежуточными посадками. Т. о. перелёт можно представить как набор из одного или нескольких элементарных перемещений, называемых сегментами.
- Сегмент — это атомарная перевозка, которую для простоты будем характеризовать всего двумя атрибутами: дата/время вылета и дата/время прилёта.
# Необходимо:
- Написать небольшой модуль, который будет заниматься фильтрацией набора перелётов согласно различным правилам. Правил фильтрации может быть очень много. Также наборы перелётов могут быть очень большими. Правила могут выбираться и задаваться динамически в зависимости от контекста выполнения операции фильтрации.
- Продумать структуру модуля, создать необходимые классы и интерфейсы.
- Покрыть свой код тестами.
- Пользовательский интерфейс не рассматривается. Достаточно вывода информации в консоль. Никаких сторонних библиотек использовать не нужно.
# Примечания:
- Приложенный файл TestClasses.java содержит упрощённые модельные классы и фабрику для получения тестовых образцов. Весь код необходимо поместить в пакет com.gridnine.testing
- Для проверочного запуска создать публичный класс Main c методом main() Этот метод должен выдать в консоль результаты обработки тестового набора перелётов. Получить тестовый набор нужно методом FlightBuilder.createFlights()
- Поместить в main() такой проверочный код.
- Исключить из тестового набора перелёты по следующим правилам (по каждому правилу нужен отдельный вывод списка перелётов):
- вылет до текущего момента времени
- имеются сегменты с датой прилёта раньше даты вылета
- общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)
