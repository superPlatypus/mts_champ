package ru.mts.chumak_service.random;

import java.time.LocalDate;
import java.util.Random;

public class RandomGenerator {
    private static final int MAX_YEARS_IN_PAST = 20;
    private static final int MONTHS_IN_YEAR = 12;
    private static final String[] SelectedProduct = {"Пирожок с мясом", "Пирожок с капустой", "Пирог с рыбой", "Пирог с ягодой", "Чай", "Кофе"};
    private static final String[] City = { "Москва", "Санкт-Петербург", "Новосибирск",  "Екатеринбург"};
    private static final String[] TypeDelivery = {"автомобиле", "велосипедах", "пеших"};
    private static final int MAX_COUNT_SELECTED_PRODUCT = 6;
    private static final int MAX_COUNT_CITY = 4;

    private int maxCountSelectedProduct;
    private int maxCountCity;

    public RandomGenerator(boolean useMultithreading) {
        if (useMultithreading) {
            maxCountSelectedProduct = 6;
            maxCountCity = 4;
        } else {
            maxCountSelectedProduct = 3;
            maxCountCity = 2;
        }
    }

    public String generateRandomSelectedProduct() {
        return SelectedProduct[new Random().nextInt(maxCountSelectedProduct)];
    }

    public String generateRandomCity() {
        return City[new Random().nextInt(maxCountCity)];
    }

    public String generateTypeDelivery() {
        return TypeDelivery[new Random().nextInt(TypeDelivery.length)];
    }

    public int generateCount() {
        return new Random().nextInt(3) + 1; // Генерируем от 1 до 3 позиций в заказе
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

