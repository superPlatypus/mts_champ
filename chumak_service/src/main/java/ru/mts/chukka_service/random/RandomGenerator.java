package ru.mts.chukka_service.random;

import java.time.LocalDate;
import java.util.Random;

public class RandomGenerator {
    // Максимальное количество лет в прошлом для генерации случайной даты рождения.
    private static final int MAX_YEARS_IN_PAST = 20;

    // Количество месяцев в году.
    private static final int MONTHS_IN_YEAR = 12;
    private static final String[] SelectedProduct = {"Пирожок с мясом", "Пирожок с капустой", "Пирог с рыбой", "Пирог с ягодой", "Чай", "Кофе"};
    private static final String[] City = { "Москва", "Санкт-Петербург", "Новосибирск",  "Екатеринбург"};
    private static final String[] TypeDelivery = {"автомобиле", "велосипедах", "пеших"};
    private int MAX_COUNT_SelectedProduct = 6;
    private int MAX_COUNT_City = 4;

    /**
     * Генерирует случайный выборанный продукт.
     */
    public String generateRandomSelectedProduct() {
        return SelectedProduct[new Random().nextInt(MAX_COUNT_SelectedProduct)];
    }

    /**
     * Генерирует случайный город.
     */
    public String generateRandomCity() {
        return City[new Random().nextInt(MAX_COUNT_City)];
    }

    /**
     * Генерирует случайный тип достаки.
     */
    public String generateTypeDelivery() {
        return City[new Random().nextInt(MAX_COUNT_City)];
    }

    public int generateCount() {
        Random random = new Random();
        return random.nextInt();
    }

    public String generateRandomDateOrder() {
        Random random = new Random();

        int randomYears = random.nextInt(MAX_YEARS_IN_PAST);

        int randomMonth = random.nextInt(MONTHS_IN_YEAR) + 1;
        int maxDaysInMonth = LocalDate.of(2023, randomMonth, 1).lengthOfMonth();
        int randomDay = random.nextInt(maxDaysInMonth) + 1;

        return String.valueOf(LocalDate.now().minusYears(randomYears).minusMonths(randomMonth).minusDays(randomDay));
    }

}
